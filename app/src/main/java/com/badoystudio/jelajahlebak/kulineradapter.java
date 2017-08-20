package com.badoystudio.jelajahlebak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class kulineradapter extends  ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] NamaKuliner;
    private final Integer[] GbrKuliner;

    public kulineradapter(AppCompatActivity context, String[] NamaKuliner, Integer[] GbrKuliner) {
        super(context, R.layout.listkuliner, NamaKuliner);


        this.context=context;
        this.NamaKuliner=NamaKuliner;
        this.GbrKuliner=GbrKuliner;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listkuliner, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaKuliner[position]);
        imageView.setImageResource(GbrKuliner[position]);

        return rowView;

    };
}
