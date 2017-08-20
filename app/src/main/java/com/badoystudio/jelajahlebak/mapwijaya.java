package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapwijaya extends AppCompatActivity {


    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Hotel+Wijaya/@-6.3522352,106.2467849,17z/data=!3m1!4b1!4m5!3m4!1s0x2e42172c5e88a225:0x30adbaac0bec9fb6!8m2!3d-6.3522352!4d106.2489736";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapwijaya);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}