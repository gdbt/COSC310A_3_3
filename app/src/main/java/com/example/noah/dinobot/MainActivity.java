package com.example.noah.dinobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView output;
    String name;
    String newtext;
    String currenttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currenttext = ("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
        newtext = ("Welcome to the Dino-Bot, Please Enter the name you would like to be called by and press the enter button.");
        currenttext += "\n" + newtext;
        output.setText(currenttext);



        Button enter = findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                EditText mainin = findViewById(R.id.mainin);
                name = mainin.getText().toString(); //making name the variable
                newtext = ("Greetings " + name + ". My name is Tee-Tee the T-Rex!!"); //printing name out along with rest of text
                currenttext += "\n" + newtext;
                output.setText(currenttext);
                //next line
                newtext = ("If you are curious type \"help\" to get a list of topics I will talk to you about!");
                currenttext += "\n" + newtext;
                output.setText(currenttext);

            }
        });
    }
}
