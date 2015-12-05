package br.com.anishitani.tracking;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void startVideo(){
		System.out.print("Hello World!");
	}
	
	private void startCamera(){
	}
}
