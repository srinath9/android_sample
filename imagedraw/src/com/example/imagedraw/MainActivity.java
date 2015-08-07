package com.example.imagedraw;

import android.app.Activity;
import android.graphics.Color;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		
		

		addListenerOnButton();
		
	}
	
	
	public void addListenerOnButton() {
		
		
		final Button button = (Button) findViewById(R.id.button1);
		final ImageView image = (ImageView) findViewById(R.id.hidden);
		
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				String uri = "@drawable/second";	
				 android.util.Log.v("EditText", button.getText().toString());
				 /*
				 int res = getResources().getIdentifier(uri, null, this.getPackageName());
				 image.setImageDrawable(res);*/
				 
				 button.setBackgroundColor(Color.RED);
				 
				 
			
				 /*android.util.Log.v(toString(image.getVisibility()),"not workinf");*/
				 
				 /*if(image.getVisibility() ==v.INVISIBLE){
					 android.util.Log.v("visiblity","is not visible");
				 }*/
				 
				 image.setVisibility(View.VISIBLE);
				
			}

		});

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
