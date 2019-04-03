package com.example.noah.dinobot;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users){
        super(context, 0, users);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        convertView = null;

// checking if it is a user or bot layout needed
        if(user.userorbot.equals("pride") || user.userorbot.equals("lila1") || user.userorbot.equals("lila2") || user.userorbot.equals("jason")){
            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.usermessage,parent,false);
            }
        }
        else if(user.userorbot.equals("bot")){
            if (convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.testcircle, parent, false);
            }

        }
        //initilizing items
        TextView tvsaid = (TextView) convertView.findViewById(R.id.itemname);
        TextView usersaid = (TextView) convertView.findViewById(R.id.textView3);
        ImageView imv = (ImageView) convertView.findViewById(R.id.icon);
        ImageView imu = (ImageView) convertView.findViewById(R.id.imageView);
        //checking if the message will be from the user or bot, also determining which profile picture to use.
        if(user.userorbot.equals("pride")){ //this is forr the pride flag picture
            imu.setImageResource(R.mipmap.pridesign);
            usersaid.setText(user.saying);
        }
        else if(user.userorbot.equals("lila1")){ //this is for the lila 1 picture
            imu.setImageResource(R.mipmap.userface);
            usersaid.setText(user.saying);
        }
        else if(user.userorbot.equals("lila2")){ //this is forr the lila 2 picture
            imu.setImageResource(R.mipmap.lilabetter);
            usersaid.setText(user.saying);
        }
        else if(user.userorbot.equals("jason")){ //this is for the Jason picture
            imu.setImageResource(R.mipmap.jasonface);
            usersaid.setText(user.saying);
        }
        else{ //this is for the bot, picking their face
            imv.setImageResource(R.mipmap.dinosaur);
            tvsaid.setText(user.saying);
        }
        return convertView; //finally returning
    }
}
