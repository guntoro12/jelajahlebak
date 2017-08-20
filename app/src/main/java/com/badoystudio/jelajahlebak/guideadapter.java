package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class guideadapter extends ArrayAdapter<String> {

    private final AppCompatActivity context;
    private final String[] Namaguide;
    private final Integer[] Gbrguide;


    public guideadapter(AppCompatActivity context, String[] Namaguide, Integer[] Gbrguide) {
        super(context, R.layout.listguide, Namaguide);

        this.context=context;
        this.Namaguide=Namaguide;
        this.Gbrguide=Gbrguide
        ;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listhotel, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(Namaguide[position]);
        imageView.setImageResource(Gbrguide[position]);

        return rowView;

    };
}
