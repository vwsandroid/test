package com.example.demo;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	String   imeistring = null;                                                          
	String   imsistring = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TelephonyManager    telephonyManager;                                             
        
	    telephonyManager  =  
	         ( TelephonyManager )getSystemService( Context.TELEPHONY_SERVICE );
	                      
	    /*
	     * getDeviceId() function Returns the unique device ID.
	     * for example,the IMEI for GSM and the MEID or ESN for CDMA phones.  
	     */                                                                
	    imeistring = telephonyManager.getDeviceId(); 
	    
	   /*
	    * getSubscriberId() function Returns the unique subscriber ID,
	  * for example, the IMSI for a GSM phone.
	  */
	   imsistring = telephonyManager.getSubscriberId();  
	   
	  /* 
		String android_id = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID);
		Log.d("Android","Android ID : "+android_id);*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
