package com.example.internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class Gettingdata extends AsyncTask<String, Integer, String> {

	protected String doInBackground(String... params){
		
		BufferedReader in = null;
		String data = null;
		try{
			HttpClient client = new DefaultHttpClient();
			URI site = new URI("http://www.mybringback.com");
			HttpGet request = new HttpGet();
			request.setURI(site);
			HttpResponse response = client.execute(request);
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer sb = new StringBuffer("");
			String l = "";
			String nl = System.getProperty("line.separator");
			while((l=in.readLine()) !=null){
				sb.append(l+nl);
				
			}
			System.out.println(sb);
			in.close();
			data = sb.toString();
			System.out.println(data);
			return data;
		}finally{
			if(in !=null){
				try{
					in.close();
					System.out.println(data);
					return data;
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
