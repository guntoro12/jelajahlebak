package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class razos extends AppCompatActivity {

    ImageView call, ig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_razos);

        call=(ImageView)findViewById(R.id.call);
        ig=(ImageView)findViewById(R.id.inst);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "087772924890";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }


        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://instagram.com/zos.jelajahlebak");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });


    }
}
