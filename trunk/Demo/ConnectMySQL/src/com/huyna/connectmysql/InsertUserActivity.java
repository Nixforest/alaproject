package com.huyna.connectmysql;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InsertUserActivity extends Activity{

	private ProgressDialog dialog;
	private String url_InsertUser = "http://huyna88.besaba.com/insert_user.php";
	EditText txtUserId;
	EditText txtFullName;
	Button btnInsert;
	JSONParser jsonParser = new JSONParser();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insert_user);
		txtUserId = (EditText)findViewById(R.id.txtUserId);
		txtFullName = (EditText)findViewById(R.id.txtFullName);
		btnInsert = (Button)findViewById(R.id.btnInsert);
		
		btnInsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new InsertUser().execute();
			}
		});
	}
	
	public class InsertUser extends AsyncTask<String, String, String>{

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			dialog = new ProgressDialog(InsertUserActivity.this);
			dialog.setMessage("Inserting...");
			dialog.setCancelable(false);
			dialog.setIndeterminate(false);
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			dialog.dismiss();
		}

		@Override
		protected String doInBackground(String... params) {
			String userId = txtUserId.getText().toString();
			String fullName = txtFullName.getText().toString();
			
			List<NameValuePair> param = new ArrayList<NameValuePair>();
			param.add(new BasicNameValuePair("UserId", userId));
			param.add(new BasicNameValuePair("FullName", fullName));
			JSONObject json = jsonParser.makeHttpRequest(url_InsertUser, "POST", param);
			// check log cat fro response
            Log.d("Create Response", json.toString());
 
            // check for success tag
            try {
                int success = json.getInt("success");
 
                if (success == 1) {
                    // successfully created product
                    Intent i = new Intent(getApplicationContext(), AllUserActivity.class);
                    startActivity(i);
 
                    // closing this screen
                    finish();
                } else {
                    // failed to create product
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
			return null;
		}
		
	}
	
}
