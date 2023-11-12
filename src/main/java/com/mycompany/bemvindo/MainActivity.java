package com.mycompany.bemvindo;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Button btn = findViewById(R.id.botaoHome);
		btn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent in =   new Intent(getApplicationContext(),Login.class);
					startActivity(in);
				}
			});
			
			
    }
}
