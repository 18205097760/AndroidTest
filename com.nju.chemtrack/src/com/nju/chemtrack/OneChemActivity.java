package com.nju.chemtrack;

import android.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;




public class OneChemActivity extends Activity {
	ImageView back,home;
	LinearLayout ghslayout;
	LinearLayout measure;
	LinearLayout company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onechem);
        initView();
    }
    
    private void initView() {
    	back = (ImageView) findViewById(R.id.back);
    	back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				OneChemActivity.this.finish();
			}
		});
    	
    	home = (ImageView) findViewById(R.id.home);
    	home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				OneChemActivity.this.finish();
			}
		});
    	
    	ghslayout = (LinearLayout) findViewById(R.id.GHSclass);
    	ghslayout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(OneChemActivity.this, GHSClassActivity.class);
				startActivity(intent);
			}
		});
    	
    	measure = (LinearLayout) findViewById(R.id.measure);
    	measure.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(OneChemActivity.this, MeasureActivity.class);
				startActivity(intent);
			}
		});
    	
    	company = (LinearLayout) findViewById(R.id.company);
    	company.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(OneChemActivity.this, CompanyActivity.class);
				startActivity(intent);
			}
		});
	}
   
}
