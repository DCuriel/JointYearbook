package com.example.jointyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener((View.OnClickListener) this);


    }

    public void onClick(View v){
        //((TextView)findViewById(R.id.textView5)).setText("Text changed");
        Intent i = new Intent(getApplicationContext(), NextActivity.class);
        startActivity(i);
    }
}