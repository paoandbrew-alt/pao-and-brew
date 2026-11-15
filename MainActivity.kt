package com.paoandbrew.kasir
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val w = WebView(this)
    w.settings.javaScriptEnabled = true
    w.settings.domStorageEnabled = true
    setContentView(w)
    w.loadUrl("file:///android_asset/index.html")
  }
}
