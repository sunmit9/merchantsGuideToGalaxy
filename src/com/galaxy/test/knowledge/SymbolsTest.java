package com.galaxy.test.knowledge;

import junit.framework.Assert;

import org.junit.Test;

import com.galaxy.knowledge.PlanetSymbols;
import com.galaxy.knowledge.Symbols;

public class SymbolsTest {

	@Test
	public void doesGetSymbolByName(){
		
		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());
		
		long symbolValue = symbols.getSymbolValueByName("X");
		
		Assert.assertEquals(symbolValue, 10L);
		
	}
	
	@Test
	public void doesReturnNullSymbol(){

		Symbols symbols = new Symbols(PlanetSymbols.getStringToSymbolMap());
		
		Object symbolValue = symbols.getSymbolValueByName("P");
		
		Assert.assertEquals(symbolValue, null);
	}
	
}
