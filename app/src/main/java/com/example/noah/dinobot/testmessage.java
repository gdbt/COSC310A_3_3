package com.example.noah.dinobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

public class testmessage extends AppCompatActivity {

    ListView listview;
    ArrayList<String> list;
    Button enterbut;
    EditText editter;
    ArrayAdapter<String> arrayAdapter;
    TextView testtext;
    UsersAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmessage);

        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        listview = (ListView) findViewById(R.id.mainlist);
        enterbut = (Button)findViewById(R.id.enterbut);
        editter = (EditText)findViewById(R.id.testedit);




        adapter = new UsersAdapter(this,arrayOfUsers);
        listview.setAdapter(adapter);

       // list=new ArrayList<String>();
       // arrayAdapter =new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1,list);

        enterbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String typegrab = editter.getText().toString();

                User newUser = new User(typegrab,"user");
                adapter.add(newUser);
                adapter.notifyDataSetChanged();
                String x = "Test";
                User nextbot = new User(x,"bot");
                adapter.add(nextbot);
                adapter.notifyDataSetChanged();

            }
        });





    }
}
