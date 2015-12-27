package com.example.helloworld.api;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "word" })
public class GetWordRequest {

	@JsonProperty("word")
	private Word word;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GetWordRequest() {
	}

	/**
	 *
	 * @param word
	 */
	public GetWordRequest(Word word) {
		this.word = word;
	}

	/**
	 *
	 * @return The word
	 */
	@JsonProperty("word")
	public Word getWord() {
		return word;
	}

	/**
	 *
	 * @param word
	 *            The word
	 */
	@JsonProperty("word")
	public void setWord(Word word) {
		this.word = word;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}