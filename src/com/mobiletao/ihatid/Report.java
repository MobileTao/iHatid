package com.mobiletao.ihatid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Report extends Activity {
	
	private Button btn_submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.report);
		
		init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		btn_submit = (Button) findViewById(R.id.buttonSubmit);
	}
	
	private OnClickListener submitReport = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			AlertDialog alertDialog = new AlertDialog.Builder(Report.this).create();
			alertDialog.setTitle(R.string.app_name);
			alertDialog.setMessage("Are you sure you want to cancel?");
			alertDialog.setButton("Ok", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			
			alertDialog.show();
		}
	};
}
