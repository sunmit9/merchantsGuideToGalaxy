package com.galaxy.commands;

import com.galaxy.Merchant;

/**
 * Class to Declare the initial value of the new item.
 * @author Girmesun
 *
 */
public class DeclarationCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToItemValue(commandString);
		
	}

}
