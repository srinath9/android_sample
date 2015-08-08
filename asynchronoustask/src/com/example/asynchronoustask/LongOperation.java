package com.example.asynchronoustask;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.TextView;
import android.app.ProgressDialog;
// Class with extends AsyncTask class
public class LongOperation  extends AsyncTask<String, Void, Void> {
     
    private final HttpClient Client = new DefaultHttpClient();
    private String Content;
    private String Error = null;
    private ProgressDialog Dialog = new ProgressDialog();
     
    TextView uiUpdate = (TextView) findViewById(R.id.output);
     
    protected void onPreExecute() {
        // NOTE: You can call UI Element here.
         
        //UI Element
        uiUpdate.setText("Output : ");
        Dialog.setMessage("Downloading source..");
        Dialog.show();
    }

    // Call after onPreExecute method
    protected Void doInBackground(String... urls) {
        try {
             
            // Call long running operations here (perform background computation)
            // NOTE: Don't call UI Element here.
             
            // Server url call by GET method
            HttpGet httpget = new HttpGet(urls[0]);
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            Content = Client.execute(httpget, responseHandler);
             
        } catch (ClientProtocolException e) {
            Error = e.getMessage();
            cancel(true);
        } catch (IOException e) {
            Error = e.getMessage();
            cancel(true);
        }
         
        return null;
    }
     
    protected void onPostExecute(Void unused) {
        // NOTE: You can call UI Element here.
         
        // Close progress dialog
        Dialog.dismiss();
         
        if (Error != null) {
             
            uiUpdate.setText("Output : "+Error);
             
        } else {
             
            uiUpdate.setText("Output : "+Content);
             
         }
    }
     
}