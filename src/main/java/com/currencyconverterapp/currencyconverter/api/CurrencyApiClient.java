package com.currencyconverterapp.currencyconverter.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyApiClient {
    // This class communicates with the currency data API
    // and encapsulates the endpoints, authentication,
    // request/response handling and any error handling

    public void getLatestRates() {
//        try {
//            URL url = new URL("https://www.metaweather.com/api/location/search/?query=London");
//
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            httpURLConnection.setRequestMethod("GET");
//            httpURLConnection.connect();
//
//            int responseCode = httpURLConnection.getResponseCode();
//
//            if (responseCode != 200) {
//                throw new RuntimeException("HttpResponseCode: " + responseCode);
//            } else {
//                StringBuilder informationString = new StringBuilder();
//                Scanner scanner = new Scanner(url.openStream());
//
//                while (scanner.hasNext()) {
//                    informationString.append(scanner.nextLine());
//                }
//
//                scanner.close();
//
//                System.out.println(informationString);
//            }
//        } catch(Exception err) {
//            err.printStackTrace();
//        }
    }
}
