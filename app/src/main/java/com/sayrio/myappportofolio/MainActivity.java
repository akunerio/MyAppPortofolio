package com.sayrio.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_1, button_2, button_3, button_4, button_5, button_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = (Button) findViewById(R.id.button_one);
        button_2 = (Button) findViewById(R.id.button_two);
        button_3 = (Button) findViewById(R.id.button_three);
        button_4 = (Button) findViewById(R.id.button_four);
        button_5 = (Button) findViewById(R.id.button_five);
        button_6 = (Button) findViewById(R.id.button_six);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("popular movies");
            }
        });


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("stock hawk");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("build it bigger");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("make your app material");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("go ubiquitous");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("capstone!!!");
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), "This button will launch my " + message, Toast.LENGTH_SHORT).show();
    }
}
