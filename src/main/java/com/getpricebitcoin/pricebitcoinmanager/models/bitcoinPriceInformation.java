package com.getpricebitcoin.pricebitcoinmanager.models;

import java.io.Serializable;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("serial")
public class bitcoinPriceInformation implements Serializable {
	
	@SerializedName("bpi")
	public JsonObject bpiInfoString;
}
