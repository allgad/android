package com.example.alexey.java18_2018_02_26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        String action = getIntent().getAction();
        if (action != null && action.equals("my_first_action")) {
            Toast.makeText(this, "Was started with first action", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Was started with second action", Toast.LENGTH_SHORT).show();
        }
    }
}
