package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class curugmunding extends AppCompatActivity {

    ImageView peta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curugmunding);


        peta=(ImageView)findViewById(R.id.peta);
        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(curugmunding.this, mapcurugmunding.class);
                startActivity(i);
                finish();



            }
        });
    }
}
