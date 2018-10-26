package com.example.vips_pc.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        textView = findViewById(R.id.txt_1);

        btn_submit = findViewById(R.id.btn_submit);

        textView.setText("HelloWorld");

        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.music);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mediaPlayer.start();
                Log.d("shubham","HELLO");
                Toast.makeText(MainActivity.this, "HELLO", Toast.LENGTH_LONG).show();
                Intent intent =new Intent(MainActivity.this,ExitActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
