package com.example.algorithm7_8.Test7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algorithm7_8.Myfaction;
import com.example.algorithm7_8.R;

public class SevenT1Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private TextView outputTV;
    private Button sevenT1Btn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_t1);
        initView();
    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        outputTV=findViewById(R.id.outputET);
        returnBtn=findViewById(R.id.returnBtn);
        sevenT1Btn=findViewById(R.id.sevenT1Btn);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sevenT1Btn:
                String input=inputET.getText().toString().trim();
                if (input.isEmpty()){
                    Toast.makeText(this,"请输入一组数据",Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer integer= Myfaction.getResult1();
                outputTV.setText(integer + "");
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(SevenT1Activity.this, SevenActivity.class);
                startActivity(intent);
                break;
        }
    }
}
