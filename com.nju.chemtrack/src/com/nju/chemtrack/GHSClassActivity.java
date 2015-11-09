package com.nju.chemtrack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;




public class GHSClassActivity extends Activity {
	ImageView back,home;
	LinearLayout hea1Layout,env1Layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ghsclass);
        initView();
    }
    
    private void initView() {
    	back = (ImageView) findViewById(R.id.back);
    	back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				GHSClassActivity.this.finish();
			}
		});
    	
    	home = (ImageView) findViewById(R.id.home);
    	home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				GHSClassActivity.this.finish();
			}
		});
    	
    	hea1Layout = (LinearLayout) findViewById(R.id.healthdanger1);
    	hea1Layout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(GHSClassActivity.this, HeaDangerActivity.class);
				startActivity(intent);			
			}
		});
    	
    	env1Layout = (LinearLayout) findViewById(R.id.envdanger1);
    	env1Layout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(GHSClassActivity.this, EnvDangerActivity.class);
				startActivity(intent);			
			}
		});
    	
	}
   
}
