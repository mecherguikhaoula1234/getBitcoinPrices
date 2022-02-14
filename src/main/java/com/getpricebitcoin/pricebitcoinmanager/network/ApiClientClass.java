package com.getpricebitcoin.pricebitcoinmanager.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Class to create the Retrofit builder for constructing our required object
 * @author Khaoula
 *
 */
public class ApiClientClass {
    private static final String BASE_URL = "https://api.coindesk.com/";

	public static Retrofit getClient() {
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		Retrofit retrofit = new Retrofit.Builder()
		                                .baseUrl(BASE_URL)
		                                .addConverterFactory(GsonConverterFactory.create())
		                                .client(httpClient.build())
		                                .build();
		return retrofit;
		}
}
