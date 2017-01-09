package com.jp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.jp.reddit.SubredditResponse;

/**
 * @author JP
 *
 */
public class PositiveConfirmation {

	final static String USER_AGENT = "java:com.jp.positiveconfirmation:v0.1";
	final static String THE_DIVISION_HOT = "https://www.reddit.com/r/AskReddit/hot.json";
	final static Pattern isBooleanQuestion = Pattern
			.compile("^((have)|(has)|(did)|(were)|(was)|(does)|(do)|(should)|(are)|(am)|(is)|(can)|(could)).*?");

	public static void main(String[] args) throws IOException {

		// Get page data
		URL url = new URL(THE_DIVISION_HOT);
		URLConnection urlConnection = url.openConnection();
		urlConnection.setRequestProperty("User-Agent", USER_AGENT);
		urlConnection.getRequestProperties().entrySet().stream().forEach(es -> {
			System.out.println(es.getKey() + " : " + es.getValue());
		});
		InputStream is = urlConnection.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		// Parse response payload
		Gson gson = new Gson();
		SubredditResponse response = gson.fromJson(isr, SubredditResponse.class);

		// Process results
		response.getData().getChildren().stream().map(r -> {
			return r.getData();
		}).filter(r -> {
			return r.getSelfText() != null;
		}).filter(r -> {
			return r.getSelfText().length() < 100;
		}).filter(r -> {
			return true;
			// return
			// isBooleanQuestion.matcher(r.getSelfText().toLowerCase()).matches();
		}).forEach(r -> {
			System.out.println(r.toString());
		});

		// Clean up
		isr.close();
		is.close();

	}
}
