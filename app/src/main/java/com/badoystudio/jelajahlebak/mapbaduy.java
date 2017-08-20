package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapbaduy extends AppCompatActivity {

    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Desa+Wisata+Suku+Baduy/@-6.2293584,106.4090896,9z/data=!4m8!1m2!2m1!1ssuku+baduy!3m4!1s0x2e4269170530e947:0xcfa76ee30d189b72!8m2!3d-6.5941748!4d106.2250415";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapbaduy);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}