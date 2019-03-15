package com.example.noah.dinobot;

import android.content.Context;
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
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.testcircle, parent, false);
        }

        TextView tvsaid = (TextView) convertView.findViewById(R.id.itemname);
        ImageView imv = (ImageView) convertView.findViewById(R.id.icon);
        if(user.userorbot.equals("user")){
            imv.setImageResource(R.mipmap.userface);
        }
        else if(user.userorbot.equals("bot")){
            imv.setImageResource(R.mipmap.dinosaur);
        }

        tvsaid.setText(user.saying);
        return convertView;
    }
}
