package com.galaxy.knowledge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ItemValue {
	
	private Map<String, Long> itemValueMap = new HashMap<String, Long>();
	
	public void addCommandAndValue(String itemName, Long value){
		this.itemValueMap.put(itemName, value);
	}
	
	public Long getValueOfItem(String itemName, Long count) {
		return itemValueMap.get(itemName) * count;
	}
	
	public Set<String> getKnownItems(){
		return this.itemValueMap.keySet();
	}
	
	
}
