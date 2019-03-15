package com.example.noah.dinobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {
static EditText welcomein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomein = findViewById(R.id.mainin2);

        Button welenter = findViewById(R.id.mainenter);
        welenter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V) {
                String namegrab = welcomein.getText().toString();
                Bundle welbun = new Bundle();
                welbun.putString("names",namegrab);
                Intent welintent = new Intent(Welcome.this, testmessage.class);
                welintent.putExtras(welbun);
                startActivity(welintent);

            }
        });
    }
}
