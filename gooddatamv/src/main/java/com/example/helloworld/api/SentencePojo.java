package com.example.helloworld.api;

import java.util.Date;

public class SentencePojo implements Cloneable {

	private Integer id;
	private String noun;
	private String verb;
	private String adjective;

	private Date generated;
	private String text;
	private Integer showDisplayCount;

	public Date getGenerated() {
		return generated;
	}

	public void setGenerated(Date generated) {
		this.generated = generated;
	}


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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getShowDisplayCount() {
		return showDisplayCount;
	}

	public void setShowDisplayCount(Integer showDisplayCount) {
		this.showDisplayCount = showDisplayCount;
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
