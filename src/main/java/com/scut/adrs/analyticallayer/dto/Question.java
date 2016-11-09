package com.scut.adrs.analyticallayer.dto;

import java.util.List;

public class Question {
	String description;
	List<String> choices;

	public Question() {
		super();
	}

	public Question(String description, List<String> choices) {
		super();
		this.description = description;
		this.choices = choices;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

}
