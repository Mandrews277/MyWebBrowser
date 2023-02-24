package com.example.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebview = findViewById(R.id.web_browser);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://www.google.ca");
        mywebview.canGoBack();
        TextView mytextview = findViewById(R.id.url_txt);
        ImageButton mybackbutton = findViewById(R.id.back_btn);

        mybackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mywebview.goBack();
            }
        });

        ImageButton mysearchbutton = findViewById(R.id.search_btn);

        mysearchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mywebview.loadUrl("https://"+mytextview.getText().toString());
            }
        });
    }
}