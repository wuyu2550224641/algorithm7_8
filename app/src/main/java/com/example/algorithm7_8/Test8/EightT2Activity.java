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
import com.example.algorithm7_8.Test7.SevenT3Activity;

public class EightT2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private TextView outputTV;
    private Button eightT2Btn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_t2);
        initView();
    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        outputTV=findViewById(R.id.outputTV);
        eightT2Btn=findViewById(R.id.eightT2Btn);
        returnBtn=findViewById(R.id.returnBtn);
        eightT2Btn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.eightT2Btn:
                String N = inputET.getText().toString().trim();
                if (N.isEmpty()) {
                    Toast.makeText(EightT2Activity.this, "请输入a的值", Toast.LENGTH_LONG).show();
                    return;
                }
                int n= Myfaction.getResult5(Integer.valueOf(N));
                outputTV.setText("N的值为:" + n);
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(EightT2Activity.this,EightActivity.class);
                startActivity(intent);
                break;
        }
    }
}
