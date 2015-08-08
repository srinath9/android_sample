package com.example.internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class GetMethodEx  {

	public String getInternetData() throws Exception{
			
			
			Gettingdata.execute(runnable);
			
	
	}
}
