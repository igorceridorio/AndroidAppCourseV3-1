package edu.calpoly.android.lab1;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

@SuppressLint("NewApi")
public class EnterNameActivity extends ActionBarActivity implements OnClickListener {

	android.widget.EditText nameField;
	android.widget.Button okButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.layout_entername);
		this.setContentView(R.layout.name_getter);
			nameField = (EditText) this.findViewById(R.id.editText1);
		okButton = (Button) this.findViewById(R.id.button1);
		okButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_enter_name, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String userNameField = nameField.getText().toString();
		if(!userNameField.isEmpty()){
			nameField.getText().clear();
			android.content.Intent intentObject = new Intent(this, HelloWorldActivity.class);
			intentObject.putExtra("name", userNameField);
			this.startActivity(intentObject);
		}
		
	}
}
