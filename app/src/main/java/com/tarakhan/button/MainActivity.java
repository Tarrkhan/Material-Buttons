package com.tarakhan.button;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raisedButton;
    AppCompatButton flatButton;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        raisedButton = (AppCompatButton)findViewById(R.id.raised_btn);
        flatButton = findViewById(R.id.flat_btn);
        floatingActionButton = findViewById(R.id.fab_btn);
        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Raised Button",Toast.LENGTH_LONG).show();
            }
        });
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Flat Button",Toast.LENGTH_LONG).show();


            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Float Button",Toast.LENGTH_LONG).show();

            }
        });
    }
}
