package com.galaxy;

import java.util.LinkedHashMap;
import java.util.Map;

public class Answers {
	private Map<String, String> questionAnswerMap = new LinkedHashMap<String, String>();
	
	public void addAnswer(String question, String answer){
		questionAnswerMap.put(question, answer);
	}
	
	public Map<String, String> getQuestionAnswerMap() {
		return questionAnswerMap;
	}
	
}
