package com.alavui.ui;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

/**
 * Main Activity
 * @author TamNT
 *
 */
public class MainActivity extends ActionBarActivity {
	/**
	 * Handle layout of drawer 
	 */
	private DrawerLayout drawerLayout;
	/**
	 * List view for drawer
	 */
	private ListView drawerList;
	/**
	 * Adapter for drawer
	 */
	private CustomDrawerAdapter adapter;
	/**
	 * List item of drawer
	 */
	private List<DrawerItem> dataList;

	/**
	 * Drawer Toggle
	 */
	private ActionBarDrawerToggle drawerToggle;

	/**
	 * Title of action bar
	 */
	private CharSequence titleActionbar;
	/**
	 * ID of icon action bar
	 */
	private int iconActionbarID;

	/**
	 * @Enum style of Action bar
	 */
	public enum ACTIONBAR_STYLE {
		FULL_ITEM, NO_ITEM, TYPE_1
	}
	/**
	 * Style of action bar
	 */
	private ACTIONBAR_STYLE actionbarStyle;

	/**
	 * Create Activity
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/**
		 * Set layout for Activity
		 */
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
		dataList = new ArrayList<DrawerItem>();
		titleActionbar = getTitle();
		addItemsToDataList();

		/**
		 * Set shadow to Drawer
		 */
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);

		/**
		 * Convert items from data list to drawer
		 */
		drawerList = (ListView) findViewById(R.id.drawer);
		adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
				dataList);
		drawerList.setAdapter(adapter);

		/**
		 * Add click event to item
		 */
		drawerList.setOnItemClickListener(new DrawerItemClickListener());

		/**
		 * Create drawer toggle and click event
		 */
		drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View view) {
				supportInvalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				supportInvalidateOptionsMenu();
			}
		};

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);

		/**
		 * Set event of drawer toggle to drawer layout
		 */
		drawerLayout.setDrawerListener(drawerToggle);
		
		
	}

	/**
	 * Add items to drawer
	 */
	private void addItemsToDataList() {
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_new), R.drawable.ic_drawer_new));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_unread), R.drawable.ic_drawer_unread));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_hot), R.drawable.ic_drawer_hot));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_old), R.drawable.ic_drawer_old));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_vote), R.drawable.ic_drawer_vote));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_upload), R.drawable.ic_drawer_upload));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_video), R.drawable.ic_drawer_video, true));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_video), R.drawable.ic_drawer_video));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_signin), R.drawable.ic_drawer_signin, true));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_signin), R.drawable.ic_drawer_signin));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_setting), R.drawable.ic_drawer_setting));
		dataList.add(new DrawerItem(getResources().getString(
				R.string.drawer_more), R.drawable.ic_drawer_more));
	}

	/**
	 * Create Action bar
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.action_bar, menu);
		return true;
	}

	/**
	 * Action for click item in drawer
	 * @param position Position of item in drawer
	 */
	public void SelectItem(int position) {
		Fragment fragment = null;
		
		/**
		 * Create a fragment for view
		 */
		switch (position) {
		case 0: {
			fragment = new ImageViewFragment(0);
			actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
			break;
		}
		case 1: {
			fragment = new ImageViewFragment(1);
			actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
			break;
		}
		case 2: {
			fragment = new ImageViewFragment(2);
			actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
			break;
		}
		case 3: {
			fragment = new ImageViewFragment(3);
			actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
			break;
		}
		case 4: {
			fragment = new ImageViewFragment(4);
			actionbarStyle = ACTIONBAR_STYLE.FULL_ITEM;
			break;
		}
		case 5: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.PostImageActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 7: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.VideoViewActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}

		case 9: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.LoginActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 10: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.SettingActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 11: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.ApplicationsActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		default: {
			break;
		}
		}

		if (fragment != null) {
			/**
			 * Apply fragment to content layout
			 */
			FragmentManager frgManager = getSupportFragmentManager();
			frgManager.beginTransaction()
					.replace(R.id.content_layout, fragment).commit();
			/**
			 * Action for click drawer item: Highlight item checked, set title,
			 * set icon, refresh action bar, close drawer
			 */
			drawerList.setItemChecked(position, true);
			setTitleActionbar(dataList.get(position).getItemName());
			setIconActionbar(dataList.get(position).getImgResID());
			supportInvalidateOptionsMenu();
			drawerLayout.closeDrawer(drawerList);
		} else {
			drawerList.setItemChecked(position, true);
		}

	}

	/**
	 * Set title action bar
	 * @param title String title to set
	 */
	public void setTitleActionbar(CharSequence title) {
		this.titleActionbar = title;
		getSupportActionBar().setTitle(title);
	}

	/**
	 * Set icon action bar
	 * @param imgResID id of image
	 */
	public void setIconActionbar(int imgResID) {
		this.iconActionbarID = imgResID;
		getSupportActionBar().setIcon(iconActionbarID);
	}

	/**
	 * Sync the toggle state after onRestoreInstanceState has occurred
	 */
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawerToggle.syncState();
	}

	/**
	 * Pass any configuration change to the drawer toggles
	 */
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		drawerToggle.onConfigurationChanged(newConfig);
	}

	/**
	 * The action bar home/up action should open or close the drawer.
	 * ActionBarDrawerToggle will take care of this.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (drawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return false;
	}

	/**
	 * Class handle for click item in drawer
	 * @author TamNT
	 *
	 */
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			if (dataList.get(position).getHaveTopDivider() == false) {
				SelectItem(position);
			}
		}
	}

	/**
	 * Update action bar
	 */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		if (actionbarStyle == ACTIONBAR_STYLE.FULL_ITEM) {
			boolean drawerOpen = drawerLayout.isDrawerOpen(drawerList);
			for (int i = 0; i < menu.size(); i++) {
				menu.getItem(i).setVisible(!drawerOpen);
			}
			getSupportActionBar().setHomeButtonEnabled(true);
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		} else if (actionbarStyle == ACTIONBAR_STYLE.NO_ITEM) {
			for (int i = 0; i < menu.size(); i++) {
				menu.getItem(i).setVisible(false);
			}
			getSupportActionBar().setHomeButtonEnabled(false);
			getSupportActionBar().setDisplayHomeAsUpEnabled(false);
		} else if (actionbarStyle == ACTIONBAR_STYLE.TYPE_1) {
			menu.clear();
			getMenuInflater().inflate(R.menu.main, menu);
		}
		return super.onPrepareOptionsMenu(menu);
	}
}
