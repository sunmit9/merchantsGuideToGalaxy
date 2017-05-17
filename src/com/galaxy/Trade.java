package com.galaxy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.galaxy.knowledge.PlanetSymbols;
import com.galaxy.knowledge.Symbols;

public class Trade {

	public static void main(String[] args) {

		PlanetSymbols planetSymbols = new PlanetSymbols();
		Symbols symbols = new Symbols(planetSymbols.getPlanetSymbolMap());
		
		try {
			FileInputStream fstream = new FileInputStream("InputFile");
			BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
			
			List<String> commands = new ArrayList<String>();
			String line;
			while((line = reader.readLine()) != null){
				commands.add(line);
			}
			Merchant merchant =  new Merchant(symbols);
			merchant.trade(commands);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
