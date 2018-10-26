package com.example.vips_pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        textView = findViewById(R.id.txt_1);

        btn_submit = findViewById(R.id.btn_submit);

        textView.setText("HelloWorld");

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("shubham","HELLO");
                Intent intent =new Intent(MainActivity.this,ExitActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
