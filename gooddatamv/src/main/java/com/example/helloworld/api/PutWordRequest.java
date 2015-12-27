package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutWordRequest {

	@JsonProperty("word")
	private Word word;

	public PutWordRequest() {
	}

	public PutWordRequest(Word word) {
		this.word = word;
	}

	@JsonProperty("word")
	public Word getWord() {
		return word;
	}

	@JsonProperty("word")
	public void setWord(Word word) {
		this.word = word;
	}

}