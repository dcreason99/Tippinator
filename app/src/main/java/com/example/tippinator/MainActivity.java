package com.example.tippinator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button avgContinent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        avgContinent = (Button) findViewById(R.id.avgContinent);
        
        avgContinent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openMainActivityContinentSelector();}
        });
    }
    public void openMainActivityContinentSelector(){

    }
    
}
