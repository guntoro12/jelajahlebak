package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class wisata extends AppCompatActivity {
    ListView list;
    String[] NamaWisata = {

            "PANTAI BAGEDUR",
            "PANTAI TANJUNG LAYAR",
            "SUKU BADUY",
            "CURUG MUNDING",

    };
    Integer[] GbrWisata={


            R.mipmap.pantaibagedur,
            R.mipmap.tanjunglayar2,
            R.mipmap.baduy,
            R.mipmap.curugmunding

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        wisataadapter adapter=new wisataadapter(this, NamaWisata, GbrWisata);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Pilihitem = NamaWisata[+position];
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(wisata.this, bagedur.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(wisata.this,tanjunglayar.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(wisata.this,baduy.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(wisata.this,curugmunding.class);
                        startActivity(newActivity3);
                        break;





                }}

        });


    }
}