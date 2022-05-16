package com.exmple.myokhttpapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    public static final String TAG = "MainActivity";
    TextView txtString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtString= findViewById(R.id.themoviedbtest);
        Presenter p  = new Presenter();
        p.onMovieDbResult();
        p.onDogApiResult();

    }

}