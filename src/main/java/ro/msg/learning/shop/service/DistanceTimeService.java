package ro.msg.learning.shop.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DistanceTimeService {

   @Value("${google-api-key}")
    private String apiKey;
    OkHttpClient client = new OkHttpClient();

    public String calculate() throws IOException {
        String url= "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Arad&destinations=Timisoara&key="+apiKey;
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
