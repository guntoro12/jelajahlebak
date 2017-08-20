package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapcurugmunding extends AppCompatActivity {

    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Curug+Munding/@-6.6104168,106.0245121,17z/data=!3m1!4b1!4m5!3m4!1s0x2e424593318f9653:0x76c9a9b369403f8f!8m2!3d-6.6104168!4d106.0267008";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapcurugmunding);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}