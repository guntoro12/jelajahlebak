package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void  onwisataClick (View theButton)
    {
        Intent wisata=new Intent(this,wisata.class);
        startActivity(wisata);
    }


    public void  onhotelClick (View theButton)
    {
        Intent hotel=new Intent(this,hotel.class);
        startActivity(hotel);
    }

    public void  onkulinerClick (View theButton)
    {
        Intent kuliner=new Intent(this,kuliner.class);
        startActivity(kuliner);
    }

    public void  onguideClick (View theButton)
    {
        Intent guide=new Intent(this,guide.class);
        startActivity(guide);
    }

}
