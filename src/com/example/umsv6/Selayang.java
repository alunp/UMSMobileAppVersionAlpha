package com.example.umsv6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class Selayang extends Activity {
	
	ImageView logo;

	
	@SuppressLint("SetJavaScriptEnabled") @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selayang_pandang);
		
		WebView wv;
		String content = "file:///android_asset/selayang.html";
		     
		wv = (WebView) findViewById(R.id.webView1);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);
		wv.loadUrl(content);
		
		logo = (ImageView) findViewById(R.id.logo);
		
		logo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				finish();
				
			}
		});
        
		
	}

	

}
