package com.getpricebitcoin.pricebitcoinmanager.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.getpricebitcoin.pricebitcoinmanager.network.CallApiBitcoinPriceImplementation;


@Controller
public class bitcoinPriceController {

	@Autowired
	private CallApiBitcoinPriceImplementation bitcoinPriceService;
	
	@RequestMapping(value= "/home")
	String getPriceBitcoin() {
		return "priceBitcointemplate";
	}
	
	@RequestMapping(value= "/getprices/{startDate}/{endDate}", method = RequestMethod.GET)
	String getPriceBitcoin(@PathVariable String startDate, @PathVariable String endDate, ModelMap modelMap) throws ParseException {
		ManageResponseCallApi.manageCallApiGetPrices(bitcoinPriceService,startDate, endDate, modelMap);
		return "priceBitcointemplate";
	}
}
