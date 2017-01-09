package com.jp.reddit;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author JP
 *
 */
public class SubredditResponse {

	private String kind;

	private SubredditResponseData data;

	public String getKind() {
		return kind;
	}

	public SubredditResponseData getData() {
		return data;
	}

	public void setData(SubredditResponseData data) {
		this.data = data;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
