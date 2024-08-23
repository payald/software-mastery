/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increasegifrankingintenorapiflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Used "Inspect-Network-Header" to find the api flow and create the urls and their sequence
 * These are unpublished APIs - registerevent
 * @author payal
 */
public class IncreaseGifRankingInTenorAPIFlow {

    // The eventnames of the APIs you want to call
    private static final String LIST_GIF_EVENT = "giflistitem_result_tap";
    private static final String PAGE_START_EVENT = "page_start";
    private static final String PAGE_DONE_EVENT = "page_done";
    private static final String ITEM_EVENT = "itemview_impression";
    
    //Name of GIF
    private static final String GIF = "https%3A%2F%2Ftenor.com%2Fsearch%2Fjoy-gifs";
    
    private static final int NUMBER_OF_CALLS = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //API call to tenor to increase ranking
       
        IncreaseGifRankingInTenorAPIFlow apiCaller = new IncreaseGifRankingInTenorAPIFlow();
        apiCaller.callApiMultipleTimes(NUMBER_OF_CALLS); // Call the API 100,000 times
    
    }
    
    //Call Tenor api for a number of times
    public void callApiMultipleTimes(int numberOfCalls) {
        for (int i = 0; i < numberOfCalls; i++) {
            try {
                String response = callApi(LIST_GIF_EVENT);
                System.out.println("Call #" + (i + 1) + ":LIST_GIF_API_URL: " + response);
                response = callApi(PAGE_START_EVENT);
                System.out.println("Call #" + (i + 1) + ":PAGE_START_API_URL: " + response);
                response = callApi(PAGE_DONE_EVENT);
                System.out.println("Call #" + (i + 1) + ":PAGE_DONE_API_URL: " + response);
                response = callApi(ITEM_EVENT);
                System.out.println("Call #" + (i + 1) + ":ITEM_API_URL: " + response);
            } catch (Exception e) {
                System.err.println("Error during call #" + (i + 1) + ": " + e.getMessage());
            }
        }
    }
    
    //Call tenor api for registershare which increases the ranking of gif in tenor
    public String callApi(String eventName) throws Exception {
        final String API_URL = String.format("https://tenor.googleapis.com/v2/registerevent?appversion=browser-r20240821-1&prettyPrint=false&key=AIzaSyC-P6_qz3FzCoXGLk6tgitZo4jEJ5mLzD8&client_key=tenor_web&locale=en&anon_id=AAYgApGra0kCrKUIVwNoDg&eventname=%1$s&component=web_mobile&current_uri=%2$s",
                eventName,GIF);
        System.out.println(API_URL);
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
