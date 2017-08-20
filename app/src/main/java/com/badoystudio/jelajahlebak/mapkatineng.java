package com.badoystudio.jelajahlebak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mapkatineng extends AppCompatActivity {


    WebView myWebView;

    String mapPath = "https://www.google.co.id/maps/place/Hotel+Bumi+Katineung/@-6.3547738,106.2443882,17z/data=!3m1!4b1!4m5!3m4!1s0x2e42172be16cc035:0xcb2d620333744a43!8m2!3d-6.3547738!4d106.2465769";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapkatineng);


        myWebView = (WebView)findViewById(R.id.mapview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(mapPath);
    }

}