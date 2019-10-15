package com.example.algorithm7_8.Test7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algorithm7_8.Myfaction;
import com.example.algorithm7_8.R;

public class SevenT3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private Button sevenT3BTN;
    private TextView resultTV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_t3);
        initView();
    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        sevenT3BTN=findViewById(R.id.sevenBtn);
        resultTV=findViewById(R.id.resultTV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(this);
        sevenT3BTN.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sevenBtn:
                String a = inputET.getText().toString().trim();
                if (a.isEmpty()) {
                    Toast.makeText(SevenT3Activity.this, "请输入a的值", Toast.LENGTH_LONG).show();
                    return;
                }
                int S = Myfaction.getResult3(Integer.valueOf(a));
                resultTV.setText("S的结果为:" + S);
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(SevenT3Activity.this, SevenActivity.class);
                startActivity(intent);
                break;
        }

    }
}
