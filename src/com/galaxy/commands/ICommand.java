package com.galaxy.commands;

import com.galaxy.Merchant;

public interface ICommand {
	public void executeCommand(final Merchant merchant, String commandString);
}
