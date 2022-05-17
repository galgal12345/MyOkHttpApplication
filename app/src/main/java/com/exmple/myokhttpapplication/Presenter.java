package com.exmple.myokhttpapplication;

import android.util.Log;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Presenter implements AppView {

    OkHttpClient client = new OkHttpClient();

    @Override
    public void getMovieDbResult() {
        onMyGetResponse("https://api.themoviedb.org/3/movie/popular?api_key=1a6249896845e0d12ad0e1a3acc66c5c");
    }

    @Override
    public void getDogApiResult() {
        onMyGetResponse("https://api.thedogapi.com/v1/images/search");
    }

    public void onMyGetResponse(String url) {
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    String myResponse = response.body().string();
                    Log.v("TAG", "my response.body() is: " + myResponse);

                }
            }
        });
    }

}
