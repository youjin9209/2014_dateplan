package com.example.dateplan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter6 extends BaseAdapter{
private Context mContext;
private Integer[] mThumbIds = {
		R.drawable.su0,R.drawable.su1,R.drawable.su2,R.drawable.su3,
		R.drawable.su4,R.drawable.su5
};


public ImageAdapter6(Context objC) {mContext = objC;}
public int getCount(){return mThumbIds.length;}
public Object getItem(int position) { return null;}
public long getItemId (int position) {return 0;}


@Override
public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	ImageView objImgView;
	
	if(convertView == null){
		objImgView = new ImageView(mContext);
		objImgView.setLayoutParams(new GridView.LayoutParams(220,200));
		objImgView.setScaleType(ImageView.ScaleType.MATRIX);
		objImgView.setPadding(5, 5, 5, 5);
	} else {
		objImgView = (ImageView) convertView;
	}
	objImgView.setImageResource(mThumbIds[position]);
	objImgView.setScaleType(ImageView.ScaleType.FIT_XY);
	objImgView.setLayoutParams(new Gallery.LayoutParams(800,1200));
	return objImgView;

	}
}
