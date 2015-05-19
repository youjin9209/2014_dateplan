package com.example.dateplan;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class Location_t extends Activity {
	int i,j,d,s=0;
	double latitude = 37.545888;
	double longitude = 126.971848;
	LatLng LOC = new LatLng(latitude, longitude);
	LatLng L = new LatLng(37.5, 120);

	double pp1,pp2;
	LatLng p1=new LatLng(pp1,pp2);

	double pp3,pp4;
	LatLng p2=new LatLng(pp3,pp4);

	LatLng a1,a2,a3,a4;
	GoogleMap mMap;
	MarkerOptions optFirst;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location_t);

		mMap = ((MapFragment)getFragmentManager()
				.findFragmentById(R.id.map)).getMap();

		ImageButton bb=(ImageButton)findViewById(R.id.b1);      
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LOC, 12));

		bb.setOnClickListener(new OnClickListener(){


			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				double r1=(a1.latitude+a2.latitude+a3.latitude+a4.latitude)/4;
				double r2=(a1.longitude+a2.longitude+a3.longitude+a4.longitude)/4;
				LatLng a5 = new LatLng(r1,r2);

				mMap.addPolyline((new PolylineOptions().add(a1,a5)
						.width(10).color(Color.rgb(228, 167, 239)).geodesic(true)));
				mMap.addPolyline((new PolylineOptions().add(a2,a5)
						.width(10).color(Color.rgb(228, 167, 239)).geodesic(true)));
				mMap.addPolyline((new PolylineOptions().add(a3,a5)
						.width(10).color(Color.rgb(228, 167, 239)).geodesic(true)));
				mMap.addPolyline((new PolylineOptions().add(a4,a5)
						.width(10).color(Color.rgb(228, 167, 239)).geodesic(true)));
				double p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

				double p1a = Math.abs(r1- 37.543849);
				double p1b = Math.abs(r2 - 126.965098);
				p1 = p1a*p1a + p1b*p1b;
				double p2a = Math.abs(r1 - 37.568087);
				double p2b = Math.abs(r2 - 126.908761);
				p2 = p2a*p2a+p2b*p2b;
				double p3a = Math.abs(r1 - 37.657176);
				double p3b = Math.abs(r2 - 127.056449);
				p3 = p3a*p3a+p3b*p3b;
				double p4a = Math.abs(r1 - 37.521570);
				double p4b = Math.abs(r2 - 127.045605);
				p4 = p4a*p4a + p4b*p4b;
				double p5a = Math.abs(r1 - 37.574385);
				double p5b = Math.abs(r2 - 127.003469);
				p5 = p5a*p5a+p5b*p5b;
				double p6a = Math.abs(r1 - 37.595622);
				double p6b = Math.abs(r2 - 127.018898);
				p6 = p6a*p6a+p6b*p6b;

				double p7a = Math.abs(r1 - 37.555510);
				double p7b = Math.abs(r2 - 126.937374);
				p7 = p7a*p7a+p7b*p7b;

				double p8a = Math.abs(r1 - 37.517101);
				double p8b = Math.abs(r2 - 126.906199);
				p8 = p8a*p8a+p8b*p8b;

				double p9a = Math.abs(r1 - 37.534710);
				double p9b = Math.abs(r2 - 126.993340);
				p9 = p9a*p9a+p9b*p9b;

				double p10a = Math.abs(r1 - 37.582229);
				double p10b = Math.abs(r2 - 127.001865);
				p10 = p10a*p10a+p10b*p10b;
				double a[] = { p1,p2,p3, p4,p5,p6,p7,p8,p9,p10 };
				Arrays.sort(a);

				mMap.addMarker(new MarkerOptions().position(a5)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
						.title("여기서 만나요")
						.snippet("우리의 중간지점^0^"));
				if ( a[0]== p1) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {
							// TODO Auto-generated method stub

							Intent intent = new Intent(Location_t.this, Yongsan.class);
							startActivity(intent);// TODO Auto-generated method stub
							return false;
						}
					});
				}
				if ( a[0]== p2) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {

							Intent intent = new Intent(Location_t.this, Mapo.class);
							startActivity(intent);// TODO Auto-generated method stub
							return false;
						}
					});
				}
				if ( a[0]== p3) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {

							Intent intent = new Intent(Location_t.this, Nowon.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;
						}});}
				if ( a[0]== p4) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {

							Intent intent = new Intent(Location_t.this, Kangnam.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;

						}});}
				if ( a[0]== p5) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {

							Intent intent = new Intent(Location_t.this, Jongro.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;
						}});}
				if ( a[0]== p6) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
						@Override
						public boolean onMarkerClick(Marker marker) {

							Intent intent = new Intent(Location_t.this, Sungbook.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;
						}});}
				if ( a[0]== p7) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){


						@Override
						public boolean onMarkerClick(Marker marker) {


							Intent intent = new Intent(Location_t.this, Shinchon.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;

						}});}
				if ( a[0]== p8) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){


						@Override
						public boolean onMarkerClick(Marker marker) {


							Intent intent = new Intent(Location_t.this, Ydpo.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;

						}});}
				if ( a[0]== p9) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){


						@Override
						public boolean onMarkerClick(Marker marker) {


							Intent intent = new Intent(Location_t.this, Itwon.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;

						}});}
				if ( a[0]== p10) {
					mMap.setOnMarkerClickListener(new OnMarkerClickListener(){


						@Override
						public boolean onMarkerClick(Marker marker) {


							Intent intent = new Intent(Location_t.this, Deahro.class);
							startActivity(intent);// TODO Auto-generated method stub

							return false;

						}});}
			}
		});

		mMap.setOnMapLongClickListener(new OnMapLongClickListener() {

			public void onMapLongClick(LatLng point) {
				while(i<2){
					if(i==0){
						mMap.addMarker(new MarkerOptions().position(point)
								.icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
						a1=point;
						i++;
					}
					else if(i==1){

						mMap.setOnMapLongClickListener(new OnMapLongClickListener() {

							public void onMapLongClick(LatLng point) {
								while(d<2){
									if(d==0){
										mMap.addMarker(new MarkerOptions().position(point)
												.icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
										a2=point;
										d++;
									}
									else if(d==1){
										mMap.setOnMapLongClickListener(new OnMapLongClickListener(){
											@Override
											public void onMapLongClick(LatLng point) {
												// TODO Auto-generated method stub
												while(s<2){
													if(s==0){
														mMap.addMarker(new MarkerOptions().position(point)
																.icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
														a3=point;
														s++;
													}
													else if(s==1){
														mMap.setOnMapLongClickListener(new OnMapLongClickListener(){

															@Override
															public void onMapLongClick(
																	LatLng point) {
																// TODO Auto-generated method stub
																while(j==0){
																	mMap.addMarker(new MarkerOptions().position(point)
																			.icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
																	a4=point;
																	j++;
																}
															}});
															s++;
													}
												}
											}
										});
										d++;
									}
								}
							}
						});
						i++;
					}
				}
			}


		});

	}
}