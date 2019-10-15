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


public class SevenT2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private TextView outputTV;
    private Button returnBtn;
    private Button sevenT2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_t2);
        initView();
        String question2ETString = inputET.getText().toString().trim();
        if (TextUtils.isEmpty(question2ETString)) {
            Toast.makeText(this, "请输入数值", Toast.LENGTH_SHORT).show();
            return;
        }
        double sqrt = Myfaction.getResult2(Integer.valueOf(question2ETString));
        outputTV.setText("平方根:" + sqrt);
    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        outputTV=findViewById(R.id.outputTV);
        returnBtn=findViewById(R.id.returnBtn);
        sevenT2Btn=findViewById(R.id.sevenT2Btn);
        returnBtn.setOnClickListener(this);
        sevenT2Btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sevenT2Btn:
                String question2ETString = inputET.getText().toString().trim();
                if (TextUtils.isEmpty(question2ETString)) {
                    Toast.makeText(this, "数值不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                double sqrt = Myfaction.getResult2(Integer.valueOf(question2ETString));
                outputTV.setText("平方根:" + sqrt);
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(SevenT2Activity.this, SevenActivity.class);
                startActivity(intent);
                break;
        }
    }
}
