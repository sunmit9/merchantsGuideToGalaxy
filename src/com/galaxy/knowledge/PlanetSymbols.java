package com.galaxy.knowledge;

import java.util.HashMap;
import java.util.Map;

public class PlanetSymbols extends Symbols{

	public PlanetSymbols(){
		super();
	}
	
	public enum ValidSymbols {
		I("I"), V("V"), X("X"), L("L"), C("C"), D("D"), M("M");
		
		String value;
		ValidSymbols(String value){
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}
		
		public static ValidSymbols getValidSymbol(String value){
			for(ValidSymbols symbol: ValidSymbols.values()){
				if(symbol.toString().equalsIgnoreCase(value))
					return symbol;
			}
			return null;
		}
	}

	private static Map<String, Long> stringToSymbolMap = new HashMap<String, Long>() {{
        put(ValidSymbols.I.toString(), 1L);
        put(ValidSymbols.V.toString(), 5L);
        put(ValidSymbols.X.toString(), 10L);
        put(ValidSymbols.L.toString(), 50L);
        put(ValidSymbols.C.toString() , 100L);
        put(ValidSymbols.D.toString(), 500L);
        put(ValidSymbols.M.toString(), 1000L);
    }};

	
	private String symbolName;
	
	private Long symbolValue;
	
	public String getSymbolName() {
		return symbolName;
	}

	public Long getSymbolValue() {
		return symbolValue;
	}
	
	public Long getSymbolValueBySymbolName(String symbolName){
		return stringToSymbolMap.get(new String(symbolName));
	}
	
	public Map<String, Long> getPlanetSymbolMap(){
		return stringToSymbolMap;
	}
		
}
