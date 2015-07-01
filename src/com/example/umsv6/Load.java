package com.example.umsv6;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class Load extends Activity {

 
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.load);
  setSplash();

 }

 public void setSplash() {
  new Thread() {
   public void run() {
    try {
     Thread.sleep(3000);
    	} catch (Exception e) {
		    }
		    Intent i = new Intent(getApplicationContext(), Beranda.class);
		    startActivity(i);
		    finish();
		    
		    
		   }
  		}.start();
 	}
}