package com.example.dateplan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class AllMap extends Activity {

   int i,d=0,num=0;
   double latitude = 37.545888;
   double longitude = 126.971848;
   LatLng LOC = new LatLng(latitude, longitude);
   LatLng L = new LatLng(37.5, 120);

   double pp1,pp2;
   LatLng p1=new LatLng(pp1,pp2);

   double pp3,pp4;
   LatLng p2=new LatLng(pp3,pp4);

   LatLng a1,a2;
   GoogleMap mMap;
   MarkerOptions optFirst;

   Marker mak1,mak2,mak3,mak4,mak5,mak6,mak7,mak8,mak9,mak10;

   LatLng yo,ma,su,yp,da,it,ga,no,sh,jo,newl;
   String key1,key2,key3,key4,key5,key6,key7,key8,key9,key10;
   int count;
   
   String locationProvider = LocationManager.NETWORK_PROVIDER;
   LocationManager locationManager;
   LocationListener locationListener;
   
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.allmap);

      mMap = ((MapFragment)getFragmentManager()
            .findFragmentById(R.id.map)).getMap();
      mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LOC, 11));

      ImageButton bb=(ImageButton)findViewById(R.id.b1);
      
      locationManager = (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
      
      bb.setOnClickListener(new OnClickListener(){
         @Override
         public void onClick(View v) {
            locationManager.requestLocationUpdates(locationProvider, 1, 1, locationListener);
            
         }
      });
      
      locationListener = new LocationListener(){
         @Override
         public void onLocationChanged(Location location) {
            // TODO Auto-generated method stub
            updateMap(location);
         }
         @Override
         public void onStatusChanged(String provider, int status,
               Bundle extras) {}
         @Override
         public void onProviderEnabled(String provider) {}
         @Override
         public void onProviderDisabled(String provider) {}
         };   
      
      yo=new LatLng(37.543849,126.965098);
      ma=new LatLng(37.568087,126.908761);
      no=new LatLng(37.657176,127.056449);
      ga=new LatLng(37.521570,127.045605);
      jo=new LatLng(37.574385,127.003469);
      su=new LatLng(37.595622,127.018898);
      sh=new LatLng(37.555510,126.937374);
      yp=new LatLng(37.517101,126.906199);
      it=new LatLng(37.534710,126.993340);
      da=new LatLng(37.582229,127.001865);


      mak1 = mMap.addMarker(
            new MarkerOptions()
            .position(yo)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            .title("용산").snippet(key1));
      mak1.showInfoWindow(); 
      mak2 = mMap.addMarker(
            new MarkerOptions()
            .position(ma)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
            .title("마포").snippet(key2));
      mak2.showInfoWindow();
      mak3 = mMap.addMarker(
            new MarkerOptions()
            .position(no)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            .title("노원").snippet(key3));
      mak3.showInfoWindow();
      mak4 = mMap.addMarker(
            new MarkerOptions()
            .position(su)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
            .title("성북").snippet(key4));
      mak4.showInfoWindow();
      mak5 = mMap.addMarker(
            new MarkerOptions()
            .position(ga)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
            .title("강남").snippet(key5));
      mak5.showInfoWindow();
      mak6 = mMap.addMarker(
            new MarkerOptions()
            .position(yp)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
            .title("영등포").snippet(key6));
      mak6.showInfoWindow();
      mak7 = mMap.addMarker(
            new MarkerOptions()
            .position(da)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            .title("대학로").snippet(key7));
      mak7.showInfoWindow();
      mak8 = mMap.addMarker(
            new MarkerOptions()
            .position(sh)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            .title("신촌").snippet(key8));
      mak8.showInfoWindow();
      mak9 = mMap.addMarker(
            new MarkerOptions()
            .position(jo)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
            .title("종로").snippet(key9));
      mak9.showInfoWindow();
      mak10 = mMap.addMarker(
            new MarkerOptions()
            .position(it)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            .title("이태원").snippet(key10));
      mak10.showInfoWindow();
      
      mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
             @Override
             public boolean onMarkerClick(Marker marker) {
                // TODO Auto-generated method stub
                if(marker.equals(mak1)){
                   Intent intent = new Intent(AllMap.this, Yongsan.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak2)){
                   Intent intent = new Intent(AllMap.this, Mapo.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak3)){
                   Intent intent = new Intent(AllMap.this, Nowon.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak4)){
                   Intent intent = new Intent(AllMap.this, Sungbook.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak5)){
                   Intent intent = new Intent(AllMap.this, Kangnam.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak6)){
                   Intent intent = new Intent(AllMap.this, Ydpo.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak7)){
                   Intent intent = new Intent(AllMap.this, Deahro.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak8)){
                   Intent intent = new Intent(AllMap.this, Shinchon.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak9)){
                   Intent intent = new Intent(AllMap.this, Jongro.class);
                   startActivity(intent);
                }
                else if(marker.equals(mak10)){
                   Intent intent = new Intent(AllMap.this, Itwon.class);
                   startActivity(intent);
                }
                return false;
             
             }});
            
   }

   public void updateMap(Location location) {
      // TODO Auto-generated method stub
      double latitude = location.getLatitude();
      double longitude = location.getLongitude();
      final LatLng LOC = new LatLng(latitude,longitude);
      
      mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LOC,11));
      Marker mk = mMap.addMarker(new MarkerOptions()
      .position(LOC).title("me!").icon(BitmapDescriptorFactory.fromResource(R.drawable.girl)));
      mk.showInfoWindow();
   }}