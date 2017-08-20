package com.badoystudio.jelajahlebak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class hoteladapter extends  ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] NamaHotel;
    private final Integer[] GbrHotel;

    public hoteladapter(AppCompatActivity context, String[] NamaHotel, Integer[] GbrHotel) {
        super(context, R.layout.listhotel, NamaHotel);


        this.context=context;
        this.NamaHotel=NamaHotel;
        this.GbrHotel=GbrHotel;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listhotel, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaHotel[position]);
        imageView.setImageResource(GbrHotel[position]);

        return rowView;

    };
}
