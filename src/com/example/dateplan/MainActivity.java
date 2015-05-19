package com.example.dateplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			ImageButton im = (ImageButton)findViewById(R.id.main);
			ImageButton im2 = (ImageButton)findViewById(R.id.main2);
			ImageButton im3 = (ImageButton)findViewById(R.id.main3);
			ImageButton im4 = (ImageButton)findViewById(R.id.main4);
			
			im.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(MainActivity.this, Location.class);
					startActivity(intent);
					//startActivity(new Intent(MainActivity.this, MenuList.class));
				}});

			im2.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//startActivity(new Intent(MenuList.this, Cafe4.class));
					Intent intent = new Intent(MainActivity.this, Location_t.class);
					startActivity(intent);
				}});
			im3.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//startActivity(new Intent(MenuList.this, Cafe4.class));
					Intent intent = new Intent(MainActivity.this, AllMap.class);
					startActivity(intent);
				}});
			im4.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//startActivity(new Intent(MenuList.this, Cafe4.class));
					Intent intent = new Intent(MainActivity.this, Info.class);
					startActivity(intent);
				}});
			
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

