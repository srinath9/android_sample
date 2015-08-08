package com.example.request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class GetMethodEx {

	public String getnetData() throws Exception{
		
		BufferedReader in = null;
		String data = null;
		try{
			HttpClient client = new DefaultHttpClient();
			URI site = new URI("http://www.google.com");
			HttpGet request = new HttpGet();
			request.setURI(site);
			HttpResponse response = client.execute(request);
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer sb = new StringBuffer("");
			String l = null;
			String nl = System.getProperty("line.separator");
			
			while((l = in.readLine()) !=null){
				sb.append(l+nl);
				
			}
			in.close();
			data = sb.toString();
			System.out.println("new line "+data);
			return data;
			
		}
		finally{
			if(in != null){
				try{
					in.close();
					System.out.println("second line "+data);
					return data;
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
