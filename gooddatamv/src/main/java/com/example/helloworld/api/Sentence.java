package com.example.helloworld.api;

public class Sentence {

	public Sentence() {

	}

	public Sentence(String value) {
		this.value = value;
	}

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Sentence [value=" + value + "]";
	}

}
