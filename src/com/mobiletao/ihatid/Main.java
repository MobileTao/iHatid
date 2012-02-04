package com.mobiletao.ihatid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	
	private Button btn_request, btn_view, btn_report, btn_ridein;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        init();
    }
    
    private void init(){
    	btn_request = (Button) findViewById(R.id.buttonRequest);
    	btn_request.setOnClickListener(sendRequest);
    	
    	btn_view = (Button) findViewById(R.id.buttonView);
    	btn_view.setOnClickListener(viewStatus);
    	
    	btn_report = (Button) findViewById(R.id.buttonReport);
    	btn_report.setOnClickListener(sendReport);
    	
    	btn_ridein = (Button) findViewById(R.id.buttonRideIn);
    	btn_ridein.setOnClickListener(rideInRequest);
    }
    
    private OnClickListener sendRequest = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(), RequestDetails.class));
		}
	};
	
	private OnClickListener viewStatus = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(), RequestViewStatus.class));
		}
	};
	
	private OnClickListener sendReport = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(), Report.class));
		}
	};
	
	private OnClickListener rideInRequest = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(), RideIn.class));
		}
	};
}