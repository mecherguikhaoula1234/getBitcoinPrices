package com.getpricebitcoin.pricebitcoinmanager.controller;

import java.text.ParseException;
import java.time.LocalDate;

import org.springframework.ui.ModelMap;

import com.getpricebitcoin.pricebitcoinmanager.Utils;
import com.getpricebitcoin.pricebitcoinmanager.models.Pair;
import com.getpricebitcoin.pricebitcoinmanager.models.bitcoinPriceInformation;
import com.getpricebitcoin.pricebitcoinmanager.network.CallApiBitcoinPriceImplementation;

/**
 * class to manage the response of calling an API
 * @author Khaoula
 *
 */
public class ManageResponseCallApi {
	/**
	 * manage the response of calling the API of getting the prices of
	 * bitcoins according to start and end date
	 * @param startDate
	 * @param endDate
	 * @param model
	 */
	public static void manageCallApiGetPrices(CallApiBitcoinPriceImplementation bitcoinPriceService,String startDate, String endDate, ModelMap model) throws ParseException{
		LocalDate date1 = LocalDate.parse(startDate);
		LocalDate date2 = LocalDate.parse(endDate);
		bitcoinPriceInformation  response = bitcoinPriceService.getPrices(date1, date2, "USD");
		
		if(response != null) {
			Pair dataAndLabelsPair = Utils.convertJsonObjectToArrays(response.bpiInfoString);
			
			model.put("labels", dataAndLabelsPair.getLabelsChartArrayList());
			model.put("data", dataAndLabelsPair.getDataChartArrayList());
			model.put("startDate", date1);
			model.put("endDate", date2);
		} else {
			model.put("error", "Error web service");
		}
	}
}
