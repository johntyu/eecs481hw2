package com.example.eecs481.johntyu.p2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView newText = (TextView)findViewById(R.id.textView1);
        
        final Button doSomething;
        doSomething = (Button)findViewById(R.id.button1);
        doSomething.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(doSomething.getText().equals("Show RealName")) {
					newText.setText(R.string.hello_world2);
					doSomething.setText("Show uniquename");
				}
				else {
					newText.setText(R.string.hello_world);
					doSomething.setText("Show RealName");
				}
				
				
			}
		});
    }
    
    protected void changeName() {
    	
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
