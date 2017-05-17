package com.galaxy.test.parser;

import org.junit.Assert;
import org.junit.Test;

import com.galaxy.parser.QuestionParser;
import com.galaxy.questions.HowManyQuestion;
import com.galaxy.questions.HowMuchQuestion;
import com.galaxy.questions.IQuestion;
import com.galaxy.questions.UnidentifiedQuestion;

public class QuestionParserTest {
	
	@Test
	public void doesAnswerHowMuchQuestionCorrect(){
		
		QuestionParser parser = new QuestionParser("How much is something of something?");

        IQuestion questionTypes = parser.toQuestion();

        Assert.assertTrue(questionTypes instanceof HowMuchQuestion);
	}
	
	@Test
	public void doesAnswerHowManyQuestionCorrect(){
		
		QuestionParser parser = new QuestionParser("  How Many credits is gold?");

        IQuestion questionTypes = parser.toQuestion();

        Assert.assertTrue(questionTypes instanceof HowManyQuestion);
	}
	
	@Test
	public void doesAnswerUnIdentifiedQuestionCorrect(){
		
		QuestionParser parser = new QuestionParser("Do you know something?");

        IQuestion questionTypes = parser.toQuestion();

        Assert.assertTrue(questionTypes instanceof UnidentifiedQuestion);

	}
	
	

}
