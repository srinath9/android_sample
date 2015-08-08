package com.example.asynchronoustask;

import java.io.IOException;
import android.view.View;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
     
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        final Button GetServerData = (Button) findViewById(R.id.GetServerData);
         
        GetServerData.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 
                // Server Request URL
                String serverURL = "http://androidexample.com/media/webservice/getPage.php";
                 
                // Create Object and call AsyncTask execute Method
                new LongOperation().execute(serverURL);
                 
            }
        });    
         
    }
     
     
   
}