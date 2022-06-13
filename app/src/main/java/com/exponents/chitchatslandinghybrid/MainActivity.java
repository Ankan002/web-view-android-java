package com.exponents.chitchatslandinghybrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView chitChats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hook();

        useEffect();
    }

    private void useEffect(){
        chitChats.loadUrl("https://hulu-ui-clone-project.vercel.app");
    }

    private void hook(){
        chitChats = (WebView) findViewById(R.id.web_view);
    }
}