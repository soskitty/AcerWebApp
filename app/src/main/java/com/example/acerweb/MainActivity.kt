package com.example.acerweb

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("http://acer:30141")
        setContentView(webView)
    }

    override fun onBackPressed() {
        val webView = findViewById<WebView>(android.R.id.content).getChildAt(0) as? WebView
        if (webView?.canGoBack() == true) webView.goBack() else super.onBackPressed()
    }
}
