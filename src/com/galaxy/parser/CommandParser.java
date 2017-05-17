package com.galaxy.parser;

import com.galaxy.commands.DeclarationCommand;
import com.galaxy.commands.DefinationCommand;
import com.galaxy.commands.ICommand;
import com.galaxy.commands.QuestionCommand;
import com.galaxy.commands.UnknownCommand;
import com.galaxy.knowledge.Dictionary;
import com.galaxy.knowledge.Symbols;

public class CommandParser {

    public static final String SEPERATOR = " ";
    public static final int START_INDEX = 0;
    
    private String commandString;
    
    Dictionary dictionary;
    
    public CommandParser(final String commandString, Dictionary dictionary) {
        this.commandString = commandString;
        this.dictionary = dictionary;
    }

    public ICommand toCommand(Symbols symbols) {
        if(isNullOrEmpty(commandString)) return new UnknownCommand();
        return buildCommandsList(symbols, commandString);
    }

    private ICommand buildCommandsList(Symbols symbols, final String commandString) {

        ICommand mappedCommand = lookupEquivalentCommand(symbols, commandString);
        
        if(mappedCommand == null){
        	return new UnknownCommand();
        }
        return mappedCommand;
    }

    private boolean isNullOrEmpty(final String commandString) {
        return (null == commandString || commandString.trim().length() == 0);
    }

    private ICommand lookupEquivalentCommand(Symbols symbols, final String commandString) {
    	if(commandString.trim().endsWith("?")){
    		return new QuestionCommand();
    	}else if(commandString.trim().endsWith("CREDITS")){
    		return new DeclarationCommand();
    	}else if(symbols.getStringToSymbolMap().get(String.valueOf(commandString.trim().charAt(commandString.trim().length()-1))) != null){
    		return new DefinationCommand();
    	}
    	return new UnknownCommand();
    }
    
    
    
    
}
