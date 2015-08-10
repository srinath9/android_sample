package com.example.intentbundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;



public class StartingPoint extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starting_point);
		
		 String[] values = new String[] { "mushrooom","Android", "iPhone","Android", "iPhone","Android", "iPhone","Android", "iPhone", "WindowsMobile",
			        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
			        "Linux", "OS/2" };
	
		 ListAdapter firstlist = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,values);
		 ListView listview = (ListView) findViewById(R.id.firstlistview);
		 listview.setAdapter(firstlist);
		 
		 
		/* listview.setOnItemClickListener(new onItemClickListener(){
			    @Override
			    protected void onListItemClick(){
			        //Do stuff
			    }
			});*/
		/* @Override 
		 protected void onListItemClick(ListView l, View v, int position, long id){
			 
			 super.onListItemClick(l,v,position,id);
			 
			 try{
				 Class ourclass = Class<T>.forName(com.example.listadapters.StartingPoint);
				 Intent ourintent = new Intent(Listadapters.this,ourclass);
				 startActivity(ourIntent);
			 }
			 catch(ClassNotFoundException e){
				 e.printStackTrace();
			 }
		 }
		 */
		 
		 listview.setOnItemClickListener(
			 new AdapterView.OnItemClickListener() {
				 public void onItemClick(AdapterView<?> parent,View view,int position,long id){
					 String value = String.valueOf(parent.getItemAtPosition(position));
					 Toast.makeText(StartingPoint.this,value, Toast.LENGTH_SHORT).show();
					 android.util.Log.d("inside menu","not in the try loop");
					 
					 /*Class ourclass = Class.forName("com.example.intentbundle.MENU");*/
					 Intent ourintent = new Intent("com.example.intentbundle.MENU");
					 startActivity(ourintent);
					 android.util.Log.e("inside menu","not in the try loop");
					 
				 }
			}
			 
		 );
		 
		 
		 
		
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.starting_point, menu);
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
