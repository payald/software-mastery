/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increasegifrankingintenorinparallel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * https://tenor.com/gifapi/documentation
 * @author payal
 */
public class IncreaseGifRankingInTenorInParallel {

    private static final String API_KEY = "LIVDSRZULELA";
    private static final String SEARCH_TERM = "rakshabandhan";
    private static final int NUM_CALLS = 20;
    private static final int NUM_THREADS = 10; // Number of threads in the pool

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IncreaseGifRankingInTenorInParallel caller = new IncreaseGifRankingInTenorInParallel();
        caller.callApiInParallel(NUM_CALLS);
    }
    public void callApiInParallel(int numberOfCalls) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < numberOfCalls; i++) {
            Callable<String> task = () -> callApi(SEARCH_TERM);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        for (int i = 0; i < futures.size(); i++) {
            try {
                String response = futures.get(i).get(); // Get the result of the API call
                System.out.println("Call #" + (i + 1) + ": " + response);
            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Error during call #" + (i + 1) + ": " + e.getMessage());
            }
        }

        executor.shutdown(); // Shutdown the executor after completing all tasks
    }

    public String callApi(String searchTerm) throws Exception {
        final String API_URL = String.format("https://g.tenor.com/v1/search?id=6982072543114098244&key=%2$s&q=%1$s",
                searchTerm, API_KEY);
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

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
            throw new Exception("Failed: HTTP error code: " + responseCode);
        }
    }
}

