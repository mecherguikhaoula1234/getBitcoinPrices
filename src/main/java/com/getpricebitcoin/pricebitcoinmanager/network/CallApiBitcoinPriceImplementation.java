package com.getpricebitcoin.pricebitcoinmanager.network;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.getpricebitcoin.pricebitcoinmanager.models.bitcoinPriceInformation;

@Service("bitcoinPriceService")
public class CallApiBitcoinPriceImplementation {

	public bitcoinPriceInformation getPrices(LocalDate startDay, LocalDate endDate, String currency) {
		try {
			BitoinPriceApiInterface bitcoinPriceApi = ApiClientClass.getClient().create(BitoinPriceApiInterface.class);
			
			return bitcoinPriceApi.getPrices(startDay, endDate, currency).execute().body();
					
		} catch (Exception e) {
			return null;
		}
	}
}
