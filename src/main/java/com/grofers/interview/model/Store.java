package com.grofers.interview.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="store")
public class Store {

	private long key;
	private String value;

	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
