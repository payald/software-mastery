/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increasegifrankingintenor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author payal
 */
public class IncreaseGIFRankingInTenor {
    // The URL of the API you want to call
    private static final String API_URL = "https://g.tenor.com/v1/registershare?id=6982072543114098244&key=LIVDSRZULELA&q=rakshabandhan";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //API call to tenor to increase ranking
       
        IncreaseGIFRankingInTenor apiCaller = new IncreaseGIFRankingInTenor();
        apiCaller.callApiMultipleTimes(1000); // Call the API 100,000 times
    
    }
    
    //Call Tenor api for a number of times
    public void callApiMultipleTimes(int numberOfCalls) {
        for (int i = 0; i < numberOfCalls; i++) {
            try {
                String response = callApi();
                System.out.println("Call #" + (i + 1) + ": " + response);
            } catch (Exception e) {
                System.err.println("Error during call #" + (i + 1) + ": " + e.getMessage());
            }
        }
    }
    
    //Call tenor api for registershare which increases the ranking of gif in tenor
    public String callApi() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000); // Set timeout for connection
        connection.setReadTimeout(5000);    // Set timeout for reading response

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new Exception("Failed : HTTP error code : " + responseCode);
        }
    }

    
}
