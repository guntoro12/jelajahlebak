package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class maptanjunglayar extends AppCompatActivity {

    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Pantai+Tanjung+Layar/@-6.994329,106.3049833,17z/data=!3m1!4b1!4m5!3m4!1s0x2e4290365ecbaad7:0xe40b1b4e2a603902!8m2!3d-6.994329!4d106.307172";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maptanjunglayar);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}