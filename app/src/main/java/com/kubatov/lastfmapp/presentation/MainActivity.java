package com.kubatov.lastfmapp.presentation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kubatov.lastfmapp.R;
import com.kubatov.lastfmapp.fragment.OnBoardActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        boolean shown = preferences.getBoolean("shown", false);

        if (!shown){
            startActivity(new Intent(MainActivity.this, OnBoardActivity.class));
            finish();
        }

    }
}
