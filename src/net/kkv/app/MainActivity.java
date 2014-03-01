package net.kkv.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.splash);	//this is for the splash page
        
        // Code to display the splash screen for set amount of Time
        Thread logoTimer = new Thread() {
        	public void run() {
        		try{
        			int logoTimer = 0;
        			while(logoTimer < 5000) {
        				sleep(100);
        				logoTimer = logoTimer + 100;
        			};
        			startActivity(new Intent("net.kkv.CLEARSCREEN"));
        		}
        		catch (InterruptedException e) {
        			//TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        		finally{
        			finish();
        		}
        	}
        };
        
        logoTimer.start();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
