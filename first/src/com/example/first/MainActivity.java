package com.example.imagedraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	public Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.button1);

		addListenerOnButton();
		
	}
	
	
	public void addListenerOnButton() {

		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
								
				 android.util.Log.v("EditText", button.getText().toString());
				
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
