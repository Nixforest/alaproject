package com.alavui.ui;
import java.util.ArrayList;


import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {//1

	// Khai bao cac bien can thiet
	private DrawerLayout drawerLayout;
	private ListView viewList;
	private ActionBarDrawerToggle drawerToggle;
	private ArrayList<ItemNavigation> itemNavigationList;


	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//1

		// Add du lieu vao array
		initArrayForListViewDrawer();
		
		//getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); 
		//getSupportActionBar().setCustomView(R.menu.action_bar);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		//setupActionBar();
		

		// Link den code
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		viewList = (ListView) findViewById(R.id.drawer);

		// bat su kien click cua list ben trai
		viewList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				
				switch (pos) {
				case 0:
					/*Toast.makeText(MainActivity.this, "Ban da tap chon Settings",
							Toast.LENGTH_LONG).show();*/
					ImageView imgView = (ImageView)findViewById(R.id.imageView1);
					imgView .setVisibility(View.INVISIBLE);
					//Intent i = new Intent(getApplicationContext(), NewActivity.class);
					//i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					//getApplicationContext().startActivity(i);
					break;
				case 1:
					Toast.makeText(MainActivity.this, "Ban da tap chon 1",
							Toast.LENGTH_LONG).show();
					break;
				case 6:
					{
						Intent intent = new Intent(com.alavui.ui.MainActivity.this,com.alavui.ui.LoginActivity.class);
						com.alavui.ui.MainActivity.this.startActivity(intent);
					}
					break;	
				default:
					break;
				}
				
				viewList.setItemChecked(pos, true);
				// Dong Drawer khi click xong
				drawerLayout.closeDrawer(viewList);

			}
		});
		
		// Set Adapter cho list ben trai
		
		ItemNavigationAdapter adapterLeft =  new ItemNavigationAdapter(this, itemNavigationList);
		viewList.setAdapter(adapterLeft);
		
		
		//drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				//GravityCompat.START);

		drawerToggle = new ActionBarDrawerToggle(this, /* Activity chua Actionbar */
											drawerLayout, /* DrawerLayout de lien ket den ActionBar */
											R.drawable.ic_drawer, /* Hinh anh Drawer */
											R.string.drawer_open, /* Chuoi mo ta hanh dong mo Drawer "open drawer" */
											R.string.drawer_close /* Chuoi mo ta hanh dong dong Drawer "close drawer" */
											) {
			public void onDrawerClosed(View view) {
				Log.d("debug", "onDrawerClosed");
				invalidateOptionsMenu(); // tao lai menu sau khi options menu da duoc thay doi
			}

			public void onDrawerOpened(View drawerView) {
				Log.d("debug", "onDrawerOpened");
				invalidateOptionsMenu();
			}
		};

		drawerLayout.setDrawerListener(drawerToggle);

	}

	// Them du lieu vao array
	private void initArrayForListViewDrawer() {
		// TODO Auto-generated method stub
		itemNavigationList = new ArrayList<ItemNavigation>();
		
		ItemNavigation itemNavigationNew = new ItemNavigation(
				R.drawable.ic_navigation_new, getResources().getString(R.string.navigation_new));
		ItemNavigation itemNavigationUnread = new ItemNavigation(
				R.drawable.ic_navigation_unread, getResources().getString(R.string.navigation_unread));
		ItemNavigation itemNavigationHot = new ItemNavigation(
				R.drawable.ic_navigation_hot, getResources().getString(R.string.navigation_hot));
		ItemNavigation itemNavigationOld = new ItemNavigation(
				R.drawable.ic_navigation_old, getResources().getString(R.string.navigation_old));
		ItemNavigation itemNavigationVote = new ItemNavigation(
				R.drawable.ic_navigation_vote, getResources().getString(R.string.navigation_vote));
		ItemNavigation itemNavigationUpload = new ItemNavigation(
				R.drawable.ic_navigation_upload, getResources().getString(R.string.navigation_upload));
		ItemNavigation itemNavigationVideo = new ItemNavigation(
				R.drawable.ic_navigation_video, getResources().getString(R.string.navigation_video));
		ItemNavigation itemNavigationSignIn = new ItemNavigation(
				R.drawable.ic_navigation_signin, getResources().getString(R.string.navigation_signin));
		ItemNavigation itemNavigationSetting = new ItemNavigation(
				R.drawable.ic_navigation_setting, getResources().getString(R.string.navigation_setting));
		ItemNavigation itemNavigationMore = new ItemNavigation(
				R.drawable.ic_navigation_more, getResources().getString(R.string.navigation_more));
		
		itemNavigationList.add(itemNavigationNew);
		itemNavigationList.add(itemNavigationUnread);
		itemNavigationList.add(itemNavigationOld);
		itemNavigationList.add(itemNavigationVote);
		itemNavigationList.add(itemNavigationUpload);
		itemNavigationList.add(itemNavigationVideo);
		itemNavigationList.add(itemNavigationSignIn);
		itemNavigationList.add(itemNavigationSetting);
		itemNavigationList.add(itemNavigationMore);
		

	}
	/**
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()...
	 */

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		Log.d("debug", "onPostCreate");
		drawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
		Log.d("debug", "onConfigurationChanged");
	}

	/*
	 * Khi goi invalidateOptionsMenu() thi chung ta phai override lai phuong
	 * thuc nay
	 */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// If the nav drawer is open, hide action items related to the content
		// view
		Log.d("debug", "onPrepareOptionsMenu");
		// Neu drawer ben trai dang mo thi an cac item cua actionbar
		boolean drawerleftOpen = drawerLayout.isDrawerOpen(viewList);
		menu.findItem(R.id.action_refresh).setVisible(!drawerleftOpen);

		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.action_bar, menu);
		return true;
	}

	// Bat su kien click tren actionbar
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		switch (id) {
		case android.R.id.home:
			Log.d("debug", "click home");
			boolean drawerleftOpen = drawerLayout.isDrawerOpen(viewList);
			if (!drawerleftOpen) {
				drawerLayout.openDrawer(Gravity.START);
			} else {
				drawerLayout.closeDrawer(viewList);
			}

			break;
		case R.id.action_refresh:
			Log.d("debug", "click refresh");
			Toast.makeText(getApplicationContext(),	"Refresh",Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}

