package com.galaxy.test;

import org.junit.Assert;
import org.junit.Test;

import com.galaxy.SymbolRules;
import com.galaxy.exceptions.RuleViolationException;
import com.galaxy.exceptions.UnknownSymbolException;
import com.galaxy.knowledge.PlanetSymbols;
import com.galaxy.knowledge.Symbols;

public class SymbolValueTest {

	@Test
	public void doesGetSymbolValueCorrectly(){
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());
		
		SymbolRules symbolRules = new SymbolRules();
		Boolean thrown = false;
		Long value = null;
		try {
			value = symbolRules.calculateValue(symbols, "MMVI");
		} catch (UnknownSymbolException e) {
		}catch (RuleViolationException e){
		}
		
		Assert.assertEquals("2006", value.toString());
	}
	
	@Test
	public void doesCatchUnknownSymbolExceptionCorrectly(){
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());
		
		SymbolRules symbolRules = new SymbolRules();
		Boolean thrown = false;
		Long value;
		try {
			value = symbolRules.calculateValue(symbols, "MAAAMVI");
		} catch (UnknownSymbolException e) {
			thrown = true;
		}catch (RuleViolationException e){
			
		}
		
		Assert.assertTrue(thrown);
	}
	
	@Test
	public void doesCatchRuleViolationExceptionCorrectly(){
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());
		
		SymbolRules symbolRules = new SymbolRules();
		Boolean thrown = false;
		Long value;
		try {
			value = symbolRules.calculateValue(symbols, "MMMMMMM");
		} catch (UnknownSymbolException e) {
		}catch (RuleViolationException e){
			thrown = true;
		}
		
		Assert.assertTrue(thrown);
	}
	
}
