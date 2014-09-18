package com.alavui.ui;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Main Activity
 * 
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
	 * ActionBar
	 */
	private ActionBar actionBar;
	/**
	 * LayoutInflater handler for view
	 */
	private LayoutInflater layoutInflater;
	/**
	 * View for actionbar custom
	 */
	private View customView;
	private Fragment fragmentContent;
	
	public enum IMAGEVIEWTYPE {
	    NEW(1), UNREAD(2), HOT(3), OLD(4), VOTE(5);

	    private final int value;
	    private IMAGEVIEWTYPE(int value) {
	        this.value = value;
	    }
	    
	    public int getValue() {
	        return value;
	    }
	}
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

		dataList = new ArrayList<DrawerItem>();
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
		drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
		
		createActionBarWithIcon();
		
		fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.NEW.getValue());
		if (fragmentContent!= null) {
			loadFragmentContent(fragmentContent);
		}
	}
	
	private void loadFragmentContent(Fragment fragment) {
		FragmentManager frgManager = getSupportFragmentManager();
		frgManager.beginTransaction()
				.replace(R.id.content_layout, fragment).commit();
	}

	/**
	 * Add items to drawer
	 */
	private void addItemsToDataList() {
		dataList.add(new DrawerItem("MAIN MENU", R.drawable.main_menu));
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
	 * Create Action bar with icon
	 */
	private void createActionBarWithIcon() {
		actionBar = getSupportActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		layoutInflater = LayoutInflater.from(this);
		customView = layoutInflater.inflate(R.layout.actionbar_with_icon, null);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#edeeef")));
		actionBar.setCustomView(customView);
		actionBar.setDisplayShowCustomEnabled(true);

		ImageButton mainMenuButton = (ImageButton) customView
				.findViewById(R.id.main_menu);
		mainMenuButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (drawerLayout.isDrawerOpen(drawerList)) {
					drawerLayout.closeDrawer(drawerList);
				} else {
					drawerLayout.openDrawer(drawerList);
				}
			}
		});

		ImageButton refreshButton = (ImageButton) customView
				.findViewById(R.id.refresh);
		refreshButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// refresh code
				drawerLayout.openDrawer(drawerList);
			}
		});

	}

	private void createActionBarWithTitle(String titleText) {
		actionBar = getSupportActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		layoutInflater = LayoutInflater.from(this);
		customView = layoutInflater.inflate(R.layout.actionbar_with_title, null);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#edeeef")));
		TextView title = (TextView) customView.findViewById(R.id.title);
		title.setText(titleText);
		actionBar.setCustomView(customView);
		actionBar.setDisplayShowCustomEnabled(true);

		ImageButton mainMenuButton = (ImageButton) customView
				.findViewById(R.id.main_menu);
		mainMenuButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (drawerLayout.isDrawerOpen(drawerList)) {
					drawerLayout.closeDrawer(drawerList);
				} else {
					drawerLayout.openDrawer(drawerList);
				}
			}
		});

		ImageButton refreshButton = (ImageButton) customView
				.findViewById(R.id.refresh);
		refreshButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// refresh code
				drawerLayout.openDrawer(drawerList);
			}
		});

	}

	/**
	 * Action for click item in drawer
	 * 
	 * @param position
	 *            Position of item in drawer
	 */
	public void SelectItem(int position) {
		/**
		 * Create a fragment for view
		 */
		switch (position) {
		case 1: {
			fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.NEW.getValue());
			createActionBarWithIcon();
			break;
		}
		case 2: {
			fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.UNREAD.getValue());
			createActionBarWithTitle(getResources().getString(R.string.drawer_unread));
			break;
		}
		case 3: {
			fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.HOT.getValue());
			createActionBarWithTitle(getResources().getString(R.string.drawer_hot));
			break;
		}
		case 4: {
			fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.OLD.getValue());
			createActionBarWithTitle(getResources().getString(R.string.drawer_old));
			break;
		}
		case 5: {
			fragmentContent = new ImageViewFragment(IMAGEVIEWTYPE.VOTE.getValue());
			createActionBarWithTitle(getResources().getString(R.string.drawer_vote));
			break;
		}
		case 6: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.PostImageActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 8: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.VideoViewActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}

		case 10: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.LoginActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 11: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.SettingActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		case 12: {
			Intent intent = new Intent(com.alavui.ui.MainActivity.this,
					com.alavui.ui.ApplicationsActivity.class);
			com.alavui.ui.MainActivity.this.startActivity(intent);
			break;
		}
		default: {
			break;
		}
		}

		if (fragmentContent != null) {
			/**
			 * Apply fragment to content layout
			 */
			loadFragmentContent(fragmentContent);
			/**
			 * Action for click drawer item: Highlight item checked, set title,
			 * set icon, refresh action bar, close drawer
			 */
			drawerList.setItemChecked(position, true);
			drawerLayout.closeDrawer(drawerList);
		} else {
			drawerList.setItemChecked(position, true);
		}

	}
	/**
	 * Class handle for click item in drawer
	 * 
	 * @author TamNT
	 * 
	 */
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			if (dataList.get(position).getHaveTopDivider() == false) {
				if (position != 0) {
					SelectItem(position);
				}
			}
		}
	}
}
