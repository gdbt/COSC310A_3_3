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
        if(user.userorbot.equals("user")){
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
        //checking if the message will be from the user or bot
        if(user.userorbot.equals("user")){
            imu.setImageResource(R.mipmap.pridesign);
            usersaid.setText(user.saying);
        }
        else{
            imv.setImageResource(R.mipmap.dinosaur);
            tvsaid.setText(user.saying);
        }
        return convertView;
    }
}
