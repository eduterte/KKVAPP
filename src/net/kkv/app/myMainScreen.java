package net.kkv.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class myMainScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
    /** Called when the user clicks the logical model icon */
    public void launchLM(View view) {
        Intent launchLM = new Intent(this, LogicalModel.class);
        startActivity(launchLM);
        	
    }
}
