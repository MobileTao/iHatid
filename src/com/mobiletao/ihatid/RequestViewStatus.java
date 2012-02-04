package com.mobiletao.ihatid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RequestViewStatus extends Activity {

	private Button btn_cancel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.requestviewstatus);
		
		init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		btn_cancel = (Button) findViewById(R.id.buttonCancel);
		btn_cancel.setOnClickListener(cancelRequest);
	}
	
	/**
	 * 
	 */
	private OnClickListener cancelRequest = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			AlertDialog alertDialog = new AlertDialog.Builder(RequestViewStatus.this).create();
			alertDialog.setTitle(R.string.app_name);
			alertDialog.setMessage("Are you sure you want to cancel?");
			alertDialog.setButton("Yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				}
			});
			alertDialog.setButton2("No", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				}
			});
			
			alertDialog.show();
			
		}
	};
}
