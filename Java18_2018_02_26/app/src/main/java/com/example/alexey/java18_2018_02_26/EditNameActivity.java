package com.example.alexey.java18_2018_02_26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditNameActivity extends AppCompatActivity implements View.OnClickListener{

    private Button okBtn, backBtn;
    private EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        okBtn = findViewById(R.id.ok_btn);
        inputName = findViewById(R.id.input_name);
        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        if(v.getId() == R.id.ok_btn) {
            Intent intent = new Intent();
            intent.putExtra("NAME", inputName.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }else if(v.getId() == R.id.back_btn){
            finish();
        }
    }
}
