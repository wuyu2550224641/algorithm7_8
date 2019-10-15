package com.example.algorithm7_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.algorithm7_8.Test7.SevenActivity;
import com.example.algorithm7_8.Test8.EightActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sevenBtn;
    private Button eightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        sevenBtn.setOnClickListener(this);
        eightBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sevenBtn:
                Intent intent = new Intent(MainActivity.this, SevenActivity.class);
                startActivity(intent);
                break;
            case R.id.eightBtn:
                Intent intent1 = new Intent(MainActivity.this, EightActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
