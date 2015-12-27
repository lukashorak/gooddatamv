package com.example.helloworld;

import java.util.HashMap;
import java.util.Set;

import com.example.helloworld.api.WordCategory;

public class DB {
	private static final DB INSTANCE = new DB();

	private DB() {
	}

	public static DB getInstance() {
		return INSTANCE;
	}

	public void addWord(String value, WordCategory type) {
		this.words.put(value, type);
	}

	public WordCategory getWord(String value) {
		return this.words.get(value);
	}

	public Set<String> getAllWordKeys() {
		return this.words.keySet();
	}
	
	public HashMap<String, WordCategory> getAllWords() {
		return this.words;
	}

	private HashMap<String, WordCategory> words = new HashMap<String, WordCategory>();
}