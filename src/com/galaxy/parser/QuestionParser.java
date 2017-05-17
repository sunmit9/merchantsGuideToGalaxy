package com.galaxy.parser;

import java.util.HashMap;
import java.util.Map;

import com.galaxy.questions.HowManyQuestion;
import com.galaxy.questions.HowMuchQuestion;
import com.galaxy.questions.IQuestion;
import com.galaxy.questions.QuestionTypes;
import com.galaxy.questions.UnidentifiedQuestion;

public class QuestionParser {
	
	private static final int QUESTION_START_INDEX = 0;

    private static Map<String, IQuestion> stringToQuestionMap = new HashMap<String, IQuestion>() {{
        put(QuestionTypes.HOW_MUCH_QUESTION.getQuestionString().toUpperCase(), new HowMuchQuestion());
        put(QuestionTypes.HOW_MANY_QUESTION.getQuestionString().toUpperCase(), new HowManyQuestion());
    }};

    private String question;

    public QuestionParser(final String question) {
        this.question = question;
    }

    public IQuestion toQuestion() {
        if(question == null || "".equalsIgnoreCase(question)) return new UnidentifiedQuestion();
        return buildQuestionTypesList(question);
   	}
    
    private IQuestion buildQuestionTypesList(String question) {

        IQuestion mappedQuestion = lookupQuestion(question.trim());

        return mappedQuestion;
    }

    private IQuestion lookupQuestion(final String questionString) {
    	
    	for(String questionTypeString : QuestionTypes.getValidQuestionValues()){
    		if(questionString.toUpperCase().contains(questionTypeString) && 
    				questionString.toUpperCase().trim().indexOf(questionTypeString) == QUESTION_START_INDEX){
    	        return stringToQuestionMap.get(questionTypeString.toUpperCase());
    		}
    	}
    	return new UnidentifiedQuestion();
    	
    }

}
