package com.exmple.myokhttpapplication;

import okhttp3.OkHttpClient;

public class Presenter implements AppView {

    @Override
    public void getMovieDbResult() {
        GetResponse.onMyGetResponse("https://api.themoviedb.org/3/movie/popular?api_key=1a6249896845e0d12ad0e1a3acc66c5c");
    }

    @Override
    public void getDogApiResult() {
        GetResponse.onMyGetResponse("https://api.thedogapi.com/v1/images/search");
    }



}
