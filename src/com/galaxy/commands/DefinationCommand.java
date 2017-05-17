package com.galaxy.commands;

import com.galaxy.Merchant;

/**
 * 
 * Class to define new words for the symbols.
 * @author Girmesun
 *
 */
public class DefinationCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToDictionary(commandString);
	}

}
