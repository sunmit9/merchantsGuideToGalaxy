package com.galaxy.test.parser;

import org.junit.Assert;
import org.junit.Test;

import com.galaxy.commands.DefinationCommand;
import com.galaxy.commands.ICommand;
import com.galaxy.commands.QuestionCommand;
import com.galaxy.knowledge.Dictionary;
import com.galaxy.knowledge.PlanetSymbols;
import com.galaxy.knowledge.Symbols;
import com.galaxy.parser.CommandParser;

public class CommandParserTest {
	
	@Test
	public void doesIdentifyCommandCorrectly(){
		
		Dictionary dictionary = new Dictionary();
		
		CommandParser parser = new CommandParser("GLOB IS I", dictionary);
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());

        ICommand questionTypes = parser.toCommand(symbols);

        Assert.assertTrue(questionTypes instanceof DefinationCommand);
	}	
	
	@Test
	public void doesIdentifyQuestionCommandCorrectly(){
		
		Dictionary dictionary = new Dictionary();
		
		CommandParser parser = new CommandParser("how much is pish tegj glob glob ?", dictionary);
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());

        ICommand questionTypes = parser.toCommand(symbols);

        Assert.assertTrue(questionTypes instanceof QuestionCommand);
	}	

}
