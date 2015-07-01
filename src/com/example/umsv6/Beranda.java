package com.example.umsv6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Beranda extends Activity {
	
	private Button btn_selayang_pandang, btn_berita,
		btn_sistem, btn_hubungi, btn_keluar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);
        
        btn_selayang_pandang = (Button) findViewById(R.id.btn_selayang_pandang);
        btn_berita = (Button) findViewById(R.id.btn_berita);
        btn_sistem = (Button) findViewById(R.id.btn_sistem);
        btn_hubungi = (Button) findViewById(R.id.btn_hubungi);
        btn_keluar = (Button) findViewById(R.id.btn_keluar);
        
        
        
        btn_selayang_pandang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), Selayang.class);
				startActivity(i);
				
				
			}
		});
        
        btn_berita.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), Berita.class);
				startActivity(i);
				
				
			}
		});
        
        btn_sistem.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), Sistem.class);
				startActivity(i);
				
			}
		});
        
        btn_hubungi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), Hubungi.class);
				startActivity(i);
			
			}
		});
        
        btn_keluar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				finish();
			
			}
		});
        
    }
}
