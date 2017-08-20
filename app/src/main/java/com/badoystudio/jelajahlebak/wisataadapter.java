package com.badoystudio.jelajahlebak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class wisataadapter extends  ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] NamaWisata;
    private final Integer[] GbrWisata;

    public wisataadapter(AppCompatActivity context, String[] NamaWisata, Integer[] GbrWisata) {
        super(context, R.layout.listwisata, NamaWisata);


        this.context=context;
        this.NamaWisata=NamaWisata;
        this.GbrWisata=GbrWisata;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listwisata, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaWisata[position]);
        imageView.setImageResource(GbrWisata[position]);

        return rowView;

    };
}
