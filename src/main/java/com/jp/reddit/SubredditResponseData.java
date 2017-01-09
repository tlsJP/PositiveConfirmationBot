package com.jp.reddit;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class SubredditResponseData {

	private String modhash;

	private List<SubredditResponseDataChild> children;

	private String before;
	private String after;

	public String getModhash() {
		return modhash;
	}

	public void setModhash(String modhash) {
		this.modhash = modhash;
	}

	public List<SubredditResponseDataChild> getChildren() {
		return children;
	}

	public void setChildren(List<SubredditResponseDataChild> children) {
		this.children = children;
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
