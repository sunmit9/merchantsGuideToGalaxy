package com.galaxy.questions;

import java.util.ArrayList;
import java.util.List;

public enum QuestionTypes {
	
	HOW_MUCH_QUESTION("HOW MUCH IS"),
	HOW_MANY_QUESTION("HOW MANY CREDITS IS");
	
	String questionString;

	private QuestionTypes(String questionString) {
		this.questionString = questionString;
	}
	
	public String getQuestionString() {
		return questionString;
	}
	
	public static List<String> getValidQuestionValues(){
		List<String> questionTypes = new ArrayList<String>();
		for(QuestionTypes questionType : QuestionTypes.values()){
			questionTypes.add(questionType.getQuestionString());
		}
		
		return questionTypes;
	}
	
}
