package com.nigel.alc4.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutALCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView webView =  findViewById(R.id.web_view);
        webView.setWebViewClient(
                new SSLTolerentWebViewClient()
        );

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(false);
        webView.loadUrl("https://andela.com/alc/");
    }

}
