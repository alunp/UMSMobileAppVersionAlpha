package com.example.umsv6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sistem extends Activity {
	
	ImageView logo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistem);
		
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
