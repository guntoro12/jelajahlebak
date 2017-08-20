package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class guide extends AppCompatActivity {

    ListView list;
    String[] Namaguide = {
            "RAZOS",
            "ZAKI",
            "REGA",



    };
    Integer[] Gbrguide={

            R.drawable.razos,
            R.drawable.zaki3,
            R.drawable.rega,


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        hoteladapter adapter=new hoteladapter(this, Namaguide, Gbrguide);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Pilihitem = Namaguide[+position];
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(guide.this, razos.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(guide.this,zaki.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(guide.this,rega.class);
                        startActivity(newActivity2);
                        break;





                }}

        });



    }
}
