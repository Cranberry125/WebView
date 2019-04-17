package com.example.webview;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebView extends AppCompatActivity {
    private WebView webView;
    //private String  urlHome="http://www.baidu.com";//默认网址
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
        setWebView();
    }
    public void intiView(){
        webView=(WebView) findViewById(R.id.web_view);
        url=getIntent().getData().toString();
        System.out.println("网址"+getIntent().getData().toString());
    }
    public void setWebView(){
      webView.getSettings().setJavaScriptEnabled(true);
      webView.getSettings().setSupportZoom(true);
      url=getIntent().getData().toString();
      webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webView.loadUrl(url);
                return true;
            }
        });

    }
}
