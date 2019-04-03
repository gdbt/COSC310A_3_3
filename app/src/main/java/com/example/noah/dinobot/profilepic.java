package com.example.noah.dinobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class profilepic extends AppCompatActivity {

    // Initializing the buttons
    ImageButton Lila1;
    ImageButton Lila2;
    ImageButton Pride;
    ImageButton Jason;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepic);

        //grabbing the intents
        Intent mainpage = getIntent(); //grabbing the name intent from the welcoming page
        Bundle mainname = mainpage.getExtras();
        name = mainname.getString("names"); //assigning names
        //setting them to the corrrect button
        Lila1 = (ImageButton)(findViewById(R.id.lilapfp));
        Lila2 = (ImageButton)(findViewById(R.id.lila2pfp));
        Pride = (ImageButton)(findViewById(R.id.pridepfp));
        Jason = (ImageButton)(findViewById(R.id.jasonpfp));

        //setting all the listeners
        Lila1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomain("lila1");
            }
        });
        Lila2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomain("lila2");
            }
        });
        Pride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomain("pride");
            }
        });
        Jason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomain("jason");
            }
        });
    }
    //this is the main intent sending to the main activity
    public void tomain(String pic){
        Intent movetomain = new Intent(profilepic.this,testmessage.class);
        Bundle picstring = new Bundle(); //making the bundle
        picstring.putString("picdata", pic); //adding the profile data
        picstring.putString("name",name); //adding the name to the bundle
        movetomain.putExtras(picstring); //adding to intent
        startActivity(movetomain); // launching
    }
}
