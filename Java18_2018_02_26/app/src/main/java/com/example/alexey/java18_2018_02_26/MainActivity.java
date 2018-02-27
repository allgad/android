package com.example.alexey.java18_2018_02_26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTxt;
    private Button setNameBtn, startSecondBtn, startMultiBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTxt = findViewById(R.id.name_txt);
        setNameBtn = findViewById(R.id.set_name_btn);
        startSecondBtn = findViewById(R.id.start_second_btn);
        startMultiBtn = findViewById(R.id.start_multi_btn);
        setNameBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, EditNameActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        startSecondBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("my.first.action");
                startActivityForResult(intent, 1);
            }
        });
        startMultiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("my.second.action");
                startActivity(intent);
            }
        });

        //nameTxt.setVisibility(View.INVISIBLE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("MY_TAG", "onActivityResult() called with: requestCode = [" + requestCode + "], resultCode = [" + resultCode + "], data = [" + data + "]");

        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                nameTxt.setText(data.getStringExtra("NAME"));
            }
        }
    }
}
