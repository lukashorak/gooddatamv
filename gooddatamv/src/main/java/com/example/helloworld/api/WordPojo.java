package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WordPojo {

	@JsonProperty("word")
	private String word;
	
	@JsonProperty("wordCategory")
	private WordCategory wordCategory;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public WordCategory getWordCategory() {
		return wordCategory;
	}

	public void setWordCategory(WordCategory wordCategory) {
		this.wordCategory = wordCategory;
	}

}
