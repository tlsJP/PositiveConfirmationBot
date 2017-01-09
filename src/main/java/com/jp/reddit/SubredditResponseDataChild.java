package com.jp.reddit;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class SubredditResponseDataChild {

	private String kind;
	private SubredditResponseDataChildData data;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public SubredditResponseDataChildData getData() {
		return data;
	}

	public void setData(SubredditResponseDataChildData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
