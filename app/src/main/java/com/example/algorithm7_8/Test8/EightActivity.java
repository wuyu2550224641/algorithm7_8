package com.example.algorithm7_8.Test8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.algorithm7_8.MainActivity;
import com.example.algorithm7_8.R;
import com.example.algorithm7_8.Test7.SevenActivity;
import com.example.algorithm7_8.Test7.SevenT1Activity;
import com.example.algorithm7_8.Test7.SevenT2Activity;
import com.example.algorithm7_8.Test7.SevenT3Activity;

public class EightActivity extends AppCompatActivity implements View.OnClickListener {
    private Button task1Btn;
    private Button task2Btn;
    private Button task3Btn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        initView();
    }

    private void initView() {
        task1Btn=findViewById(R.id.task1Btn);
        task2Btn=findViewById(R.id.task2Btn);
        task3Btn=findViewById(R.id.task3Btn);
        returnBtn=findViewById(R.id.returnBtn);
        task1Btn.setOnClickListener(this);
        task2Btn.setOnClickListener(this);
        task3Btn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.task1Btn:
                Intent intent = new Intent(EightActivity.this, EightT1Activity.class);
                startActivity(intent);
                break;
            case R.id.task2Btn:
                Intent intent1 = new Intent(EightActivity.this, EightT2Activity.class);
                startActivity(intent1);
                break;
            case R.id.task3Btn:
                Intent intent2 = new Intent(EightActivity.this, EightT3Activity.class);
                startActivity(intent2);
                break;
            case R.id.returnBtn:
                Intent intent3 = new Intent(EightActivity.this, MainActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
