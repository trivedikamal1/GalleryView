package com.sai.samples.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class GalleryView extends Activity {
    Integer[] pics = {
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10,
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10,
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10,
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10,
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10,
    		R.drawable.antartica1,
    		R.drawable.antartica2,
    		R.drawable.antartica3,
    		R.drawable.antartica4,
    		R.drawable.antartica5,
    		R.drawable.antartica6,
    		R.drawable.antartica7,
    		R.drawable.antartica8,
    		R.drawable.antartica9,
    		R.drawable.antartica10


    };
    ImageView imageView;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Gallery ga = (Gallery)findViewById(R.id.Gallery01);
        ga.setAdapter(new ImageAdapter(this));

        Gallery ga1 = (Gallery)findViewById(R.id.Gallery02);
        ga1.setAdapter(new ImageAdapter(this));

        Gallery ga2 = (Gallery)findViewById(R.id.Gallery03);
        ga2.setAdapter(new ImageAdapter(this));

        imageView = (ImageView)findViewById(R.id.ImageView01);
        ga.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getBaseContext(), 
						"You have selected picture " + (arg2+1) + " of Antartica", 
						Toast.LENGTH_SHORT).show();
				imageView.setImageResource(pics[arg2]);
				
			}
        	
        });
        
    }
    
    
    public class ImageAdapter extends BaseAdapter {

    	private Context ctx;
    	int imageBackground;
    	
    	public ImageAdapter(Context c) {
			ctx = c;
			TypedArray ta = obtainStyledAttributes(R.styleable.Gallery1);
			imageBackground = ta.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 1);
			ta.recycle();
		}

		@Override
    	public int getCount() {
    		
    		return pics.length;
    	}

    	@Override
    	public Object getItem(int arg0) {
    		
    		return arg0;
    	}

    	@Override
    	public long getItemId(int arg0) {
    		
    		return arg0;
    	}

    	@Override
    	public View getView(int arg0, View arg1, ViewGroup arg2) {
    		ImageView iv = new ImageView(ctx);
    		iv.setImageResource(pics[arg0]);
    		//iv.setPadding(50, 50, 50, 50);
    		iv.setScaleType(ImageView.ScaleType.FIT_XY);
    		iv.setLayoutParams(new Gallery.LayoutParams(150,120));
    		iv.setBackgroundResource(imageBackground);
            
    		return iv;
    	}

    }
}