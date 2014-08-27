package com.alavui.ui;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Custom adapter
 * @author TamNT
 *
 */
public class CustomDrawerAdapter extends ArrayAdapter<DrawerItem> {

	/**
	 * Context of activity
	 */
	Context context;
	/**
	 * List drawer item
	 */
	List<DrawerItem> drawerItemList;
	/**
	 * ID of layout
	 */
	int layoutResID;

	/**
	 * Constructor
	 * @param context context of activity
	 * @param layoutResourceID ID of layout
	 * @param listItems list drawer item
	 */
	public CustomDrawerAdapter(Context context, int layoutResourceID,
			List<DrawerItem> listItems) {
		super(context, layoutResourceID, listItems);
		this.context = context;
		this.drawerItemList = listItems;
		this.layoutResID = layoutResourceID;

	}

	/**
	 * Get view and create drawer item view
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		DrawerItemHolder drawerHolder;
		View view = convertView;

		if (view == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			drawerHolder = new DrawerItemHolder();
			/**
			 * Create holder
			 */
			view = inflater.inflate(layoutResID, parent, false);
			drawerHolder.itemName = (TextView) view
					.findViewById(R.id.drawer_itemName);
			drawerHolder.topDivider = (TextView) view.findViewById(R.id.topDivider);
			drawerHolder.icon = (ImageView) view.findViewById(R.id.drawer_icon);
			drawerHolder.itemLayout = (LinearLayout) view
					.findViewById(R.id.itemLayout);

			view.setTag(drawerHolder);

		} else {
			drawerHolder = (DrawerItemHolder) view.getTag();
		}

		/**
		 * Create item
		 */
		DrawerItem drawerItem = (DrawerItem) this.drawerItemList.get(position);

		
		if (drawerItem.getHaveTopDivider() == true) {
			drawerHolder.itemLayout.setVisibility(LinearLayout.GONE);
		} else {
			drawerHolder.topDivider.setVisibility(LinearLayout.GONE);
		}
		drawerHolder.icon.setImageDrawable(view.getResources().getDrawable(
				drawerItem.getImgResID()));
		drawerHolder.itemName.setText(drawerItem.getItemName());
		return view;
	}

	/**
	 * Holder
	 * @author TamNT
	 *
	 */
	private static class DrawerItemHolder {
		/**
		 * TextView of item name, top divider
		 */
		TextView itemName, topDivider;
		/**
		 * view icon in drawer
		 */
		ImageView icon;
		/**
		 * layout of item
		 */
		LinearLayout itemLayout;
	}
}