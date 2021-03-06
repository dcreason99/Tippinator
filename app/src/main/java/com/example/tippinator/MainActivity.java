package com.example.tippinator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    Button avgContinent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        avgContinent = (Button) findViewById(R.id.avgContinent);
        
        buttonContinent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openMainActivityContinentSelector();}
        });
    }
    public void openMainActivityContinentSelector(){
    }
    
}
