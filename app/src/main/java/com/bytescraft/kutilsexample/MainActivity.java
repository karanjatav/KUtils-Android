package com.bytescraft.kutilsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bytescraft.kutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("Something");
    }
}
