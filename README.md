# WebView
lab5-1:自定义浏览器
# 代码:
```
MyWebView.java
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


activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MyWebView">
    <WebView
        android:id="@+id/web_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"></WebView>
</LinearLayout>
```
运行截图：

![E32C9C32116867AA5FF442A401FC5555.jpg](https://i.loli.net/2019/04/18/5cb89b87d1f33.jpg)


