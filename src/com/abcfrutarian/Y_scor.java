package com.abcfrutarian;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

public class Y_scor extends Activity {
private static int waktu = 5000;
	TextView ss;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.y_scor);
		ss = (TextView) findViewById(R.id.sh);
		Intent i = getIntent();
		String sh = i.getStringExtra("your");
		ss.setText(sh);
		
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				
				finish();
				
			}
		},waktu);

}
}
