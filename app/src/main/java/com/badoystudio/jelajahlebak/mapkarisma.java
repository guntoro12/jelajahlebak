package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapkarisma extends AppCompatActivity {


    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Kharisma+Jujuluk+Hotel/@-6.3480245,106.2611631,17z/data=!3m1!4b1!4m5!3m4!1s0x2e4210c700000001:0xfe74f23477a2202a!8m2!3d-6.3480245!4d106.2633518";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapkarisma);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}