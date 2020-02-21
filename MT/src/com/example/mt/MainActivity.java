package com.example.mt;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Handler hand = new Handler();
	Button clickme;
	TextView timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = (TextView) findViewById(R.id.textView2);
        clickme = (Button) findViewById(R.id.button1);
        hand.postDelayed(run, 1000);
    }

    Runnable run = new Runnable() {
    	@Override
    	public void run() {
    	updateTime();
    	}
    	};
    	public void updateTime() {
    	timer.setText("" + (Integer.parseInt(timer.getText().toString()) - 1));
    	if (Integer.parseInt(timer.getText().toString()) == 0) {
    	clickme.setVisibility(View.VISIBLE);
    	} else {
    	hand.postDelayed(run, 1000);
    	}
    	}
    	public void clicker(View view){
    	hand.postDelayed(run, 1000);
    	timer.setText("10");
    	clickme.setVisibility(View.INVISIBLE);
    	}
    	}
