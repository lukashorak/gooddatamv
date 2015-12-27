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
@JsonPropertyOrder({ "wordCategory" })
public class Word {

	@JsonProperty("wordCategory")
	private WordCategory wordCategory;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Word() {
	}

	/**
	 *
	 * @param wordCategory
	 */
	public Word(WordCategory wordCategory) {
		this.wordCategory = wordCategory;
	}

	/**
	 *
	 * @return The wordCategory
	 */
	@JsonProperty("wordCategory")
	public WordCategory getWordCategory() {
		return wordCategory;
	}

	/**
	 *
	 * @param wordCategory
	 *            The wordCategory
	 */
	@JsonProperty("wordCategory")
	public void setWordCategory(WordCategory wordCategory) {
		this.wordCategory = wordCategory;
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