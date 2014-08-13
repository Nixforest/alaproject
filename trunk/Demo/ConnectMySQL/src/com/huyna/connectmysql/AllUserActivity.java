package com.huyna.connectmysql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class AllUserActivity extends ListActivity{

	private ProgressDialog dialog;
	private String urlGetAllUser = "http://huyna88.besaba.com/get_all_users.php";
	private JSONParser parser = new JSONParser();
	private JSONArray users = null;
	private ArrayList<HashMap<String, String>> lstUser;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_users);
		lstUser = new ArrayList<HashMap<String,String>>();
		new LoadAllUser().execute();
	}
	
	class LoadAllUser extends AsyncTask<String, String, String>{

		@Override
		protected String doInBackground(String... params) {
			List<NameValuePair> param = new ArrayList<NameValuePair>();
			JSONObject json = parser.makeHttpRequest(urlGetAllUser, "GET", param);
			try{
				int success = json.getInt("success");
				if(success == 1){
					users = json.getJSONArray("Users");
					for(int i=0; i < users.length(); i++){
						JSONObject user = users.getJSONObject(i);
						String userId = user.getString("UserId");
						String fullName = user.getString("FullName");
						
						HashMap<String, String> map = new HashMap<String, String>();
						map.put("UserId", userId);
						map.put("FullName", fullName);
						
						lstUser.add(map);
					}
				}else{
					Intent intent = new Intent(getApplicationContext(), InsertUserActivity.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "No user found!", Toast.LENGTH_SHORT);
				}
			}catch(JSONException e){
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			dialog = new ProgressDialog(AllUserActivity.this);
			dialog.setMessage("Loading all users...!");
			dialog.setIndeterminate(false);
			dialog.setCancelable(false);
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			dialog.dismiss();
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					ListAdapter adapter = new SimpleAdapter(AllUserActivity.this, lstUser, R.layout.list_items, 
							new String[]{"UserId", "FullName"}, new int[]{R.id.userId, R.id.fullName});
					setListAdapter(adapter);
				}
			});
		}
		
	}
}
