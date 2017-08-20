package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapbagedur extends AppCompatActivity {

    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Pantai+Bagedur/@-6.8139805,105.9902485,17z/data=!3m1!4b1!4m5!3m4!1s0x2e42580db85e3ee1:0x785efd54ab2cebb!8m2!3d-6.8139805!4d105.9924372";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapbagedur);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}
