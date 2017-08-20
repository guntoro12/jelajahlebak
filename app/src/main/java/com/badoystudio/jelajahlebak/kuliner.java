package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class kuliner extends AppCompatActivity {



    ListView list;
    String[] NamaKuliner = {

            "JOJORONG",
            "LEUMEUNG",
            "PASUNG",
            "EMPING",


    };
    Integer[] GbrKuliner= {


            R.mipmap.jojorong,
            R.mipmap.lemeng,
            R.mipmap.kuepasung,
            R.mipmap.emping,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        kulineradapter adapter=new kulineradapter(this, NamaKuliner, GbrKuliner);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Pilihitem = NamaKuliner[+position];
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(kuliner.this, jojorong.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(kuliner.this,leumeung.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(kuliner.this,pasung.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(kuliner.this,emping.class);
                        startActivity(newActivity3);
                        break;





                }}

        });



    }
}