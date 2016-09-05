package com.example.user.test_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test_1Activity extends AppCompatActivity {
    Button btn01;
    Button btn02;
    Button btn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("안드로이드");
        setContentView(R.layout.activity_test_1);

        btn01 = (Button) findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test_1Activity.this,NaxtActivity.class);
                startActivity(intent);
            }
        });

    }
}
