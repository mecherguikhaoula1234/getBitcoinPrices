package com.getpricebitcoin.pricebitcoinmanager;

import java.util.ArrayList;

import com.getpricebitcoin.pricebitcoinmanager.models.Pair;
import com.google.gson.JsonObject;

/**
 * this class is to create generic methods that are useful in many classes
 * @author Khaoula
 *
 */
public class Utils {
	public static Pair convertJsonObjectToArrays(JsonObject  response) {
		ArrayList<String> labelsArrayList = new ArrayList<String>();
		ArrayList<Object> dataArrayList = new ArrayList<Object>();
		
		for (Object key : response.keySet()) {
			//based on you key types
			String keyStr = (String)key;
		    Object keyvalue = response.get(keyStr);
	        labelsArrayList.add(keyStr);
            dataArrayList.add(keyvalue);
            }
		 return new Pair(dataArrayList, labelsArrayList);
	}
}
