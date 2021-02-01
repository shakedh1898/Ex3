package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        count = 0;
    }

    public void clicked(View view) {
        count++;
        if (count==7) {
            count = 0;
            btn.setText("Enough to click goto new start");
        } else {
            btn.setText("This is click number: "+count);
        }
    }
}