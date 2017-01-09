package com.jp.reddit;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class SubredditResponseDataChildData {

	private String author;
	private String selftext;

	public String getSelfText() {
		return selftext;
	}

	public void setSelfText(String selfText) {
		this.selftext = selfText;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
