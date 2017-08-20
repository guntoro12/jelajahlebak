package com.badoystudio.jelajahlebak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class hotel extends AppCompatActivity {


    ListView list;
    String[] NamaHotel = {
            "HOTEL MUTIARA LEBAK",
            "HOTEL KATINENG",
            "HOTEL WIJAYA",
            "HOTEL KARISMA"


    };
    Integer[] GbrHotel={

            R.drawable.katineng,
            R.drawable.katineng,
            R.drawable.katineng,
            R.drawable.katineng,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        hoteladapter adapter=new hoteladapter(this, NamaHotel, GbrHotel);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Pilihitem = NamaHotel[+position];
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(hotel.this, mutiara.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(hotel.this,katineng.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(hotel.this,wijaya.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(hotel.this,karisma.class);
                        startActivity(newActivity3);
                        break;





                }}

        });



    }
}
