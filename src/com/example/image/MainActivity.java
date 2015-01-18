package com.example.image;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.hardware.Camera.Parameters;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
public class MainActivity extends Activity
{
	//Defining ImageView i1,i2
	 ImageView i1,i2;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Referring ImageView i1 and i2
		i1=(ImageView)findViewById(R.id.imageView1);
		i2=(ImageView)findViewById(R.id.imageView2);
		//Listener for imageView i1 -onClick
		i1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				//Making i2 as visible
				i2.setVisibility(View.VISIBLE);
				//Making i1 as invisible
				arg0.setVisibility(View.GONE);
			}
		});
		//Listener for imageView i1 -onClick
		i2.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Making i1 as visible
				i1.setVisibility(View.VISIBLE);
				//Making i2 as invisible
				arg0.setVisibility(View.GONE);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}