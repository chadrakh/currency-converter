package com.currencyconverterapp.currencyconverter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        // This class serves as the entry point of the application
        // and handles communication with the other classes
        try {
            var symbols = "EUR,USD,AUD";
            var base = "GBP";
            URL url = new URL("https://api.apilayer.com/exchangerates_data/latest?symbols=" + symbols + "&base=" + base);

            System.out.println(url);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("apikey", "dzkU9IYogTt2Q4dzbb2cTH2pu3egI1Gr");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Print the response
                System.out.println("Response Code: " + responseCode);
                System.out.println("Response: " + response);

                // Close the connection
                connection.disconnect();

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
