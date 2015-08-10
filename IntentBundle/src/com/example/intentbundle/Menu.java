package com.example.intentbundle;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.ListView;

import android.widget.ArrayAdapter;

public class Menu extends ListActivity{
	
	 String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2" };
	 
	 protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 setListAdapter(new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,values));
	 }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		android.util.Log.d("inside menu","not in the try loop");
		
		// press any button to go to startingpoint
		 /*Class ourclass = Class.forName("com.example.intentbundle.STARTINGPOINT");*/
		 Intent ourintent = new Intent("com.example.intentbundle.STARTINGPOINT");
		 startActivity(ourintent);
		 android.util.Log.d("inside menu","not in the try loop");
		 
	}
	

}
