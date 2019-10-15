package com.example.algorithm7_8.Test8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algorithm7_8.Myfaction;
import com.example.algorithm7_8.R;

public class EightT1Activity extends AppCompatActivity {
    private TextView outputTV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_t1);
        initView();
        int i = Myfaction.getResult4(16, 35);
        outputTV.setText("c=" + i);
    }

    private void initView() {
        outputTV=findViewById(R.id.outputTV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightT1Activity.this,EightActivity.class);
                startActivity(intent);
            }
        });
    }
}
