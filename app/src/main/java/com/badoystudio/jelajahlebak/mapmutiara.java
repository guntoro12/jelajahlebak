package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapmutiara extends AppCompatActivity {


    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Hotel+Mutiara/@-6.2294323,106.4090911,9z/data=!4m8!1m2!2m1!1shotel+mutiara+lebak!3m4!1s0x2e4216dfca3aacbb:0x521707b67814d6a9!8m2!3d-6.3616873!4d106.2300146";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapmutiara);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}