package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class wijaya extends AppCompatActivity {



    ImageView peta, call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wijaya);


        peta=(ImageView)findViewById(R.id.peta);
        call=(ImageView)findViewById(R.id.call);
        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(wijaya.this, mapwijaya.class);
                startActivity(i);
                finish();



            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "0252201291";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }


        });


    }
}
