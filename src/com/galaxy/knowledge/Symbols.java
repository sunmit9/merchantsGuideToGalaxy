package com.galaxy.knowledge;

import java.util.Map;

public class Symbols {
	
	public Symbols() {
	}
	
	private static Map<String, Long> stringToSymbolMap;

	public Symbols(Map<String, Long> stringToSymbolMap) {
		this.stringToSymbolMap = stringToSymbolMap;
	}

	public static Map<String, Long> getStringToSymbolMap() {
		return stringToSymbolMap;
	}

	public Long getSymbolValueByName(String symbolName) {
		return stringToSymbolMap.get(symbolName);
	}

}
