package com.mobiletao.ihatid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RequestDetails extends Activity {

	private Button btn_submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.requestdetails);
		
		init();
	}
	
	private void init(){
		btn_submit = (Button) findViewById(R.id.buttonSubmitRequest);
		btn_submit.setOnClickListener(submitRequest);
	}
	
	private OnClickListener submitRequest = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(), RequestViewStatus.class));
		}
	};
}
