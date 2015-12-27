package com.example.helloworld.api;

public class SentencePojo {

	private Integer id;
	private String noun;
	private String verb;
	private String adjective;

	public SentencePojo() {

	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

}
