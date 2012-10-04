package com.example.com.tw.sample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("NewApi")
			public void onClick(View v) {
				EditText txt = (EditText) findViewById(R.id.editText1);
				String name = txt.getText().toString();
				if(name.toString().isEmpty()){
					name = "World";
				}
				
				
				TextView lbl = (TextView) findViewById(R.id.textView1);
				lbl.setText(String.format("Hello, %s!",name));
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sample, menu);
        return true;
    }
}
