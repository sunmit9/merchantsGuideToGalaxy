package com.galaxy.questions;

import com.galaxy.Merchant;
import com.galaxy.commands.ICommand;

public interface IQuestion{
	public void answerQuestion(final Merchant merchant, String questionString);
}
