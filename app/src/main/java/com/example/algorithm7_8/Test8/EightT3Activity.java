package com.example.algorithm7_8.Test8;

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

public class EightT3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private TextView outputTV;
    private Button eightT3Btn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_t3);
        initView();
    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        outputTV=findViewById(R.id.outputTV);
        eightT3Btn=findViewById(R.id.eightT3Btn);
        returnBtn=findViewById(R.id.returnBtn);
        eightT3Btn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.eightT3Btn:
                String number = inputET.getText().toString().trim();
                if (number.isEmpty()) {
                    Toast.makeText(EightT3Activity.this, "请输入a的值", Toast.LENGTH_LONG).show();
                    return;
                }
                Integer integer = Integer.valueOf(number);
                if(integer == Myfaction.getResult6(integer)){
                   outputTV.setText("是的");
                }else {
                    outputTV.setText("不是的");
                }
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(EightT3Activity.this,EightActivity.class);
                startActivity(intent);
                break;
        }
    }
}
