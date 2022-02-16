package com.getpricebitcoin.pricebitcoinmanager.network;

import java.time.LocalDate;

import com.getpricebitcoin.pricebitcoinmanager.models.bitcoinPriceInformation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 
 * @author Khaoula
 *
 */
public interface BitoinPriceApiInterface {
	@GET("/v1/bpi/historical/close.json")
	 public Call<bitcoinPriceInformation> getPrices(
		      @Query("start") LocalDate startDate,
		      @Query("end") LocalDate endDate,
                      @Query("currency") String currency);
}
