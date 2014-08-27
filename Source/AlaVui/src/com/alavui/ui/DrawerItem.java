package com.alavui.ui;

/**
 * Drawer item
 * @author TamNT
 *
 */
public class DrawerItem {

	/**
	 * Name item
	 */
	String itemName;
	/**
	 * ID of image
	 */
	int imgResID;
	/**
	 * Have top divider or not
	 */
	boolean haveTopDivider;

	/**
	 * Constructor
	 * @param itemName name of item
	 * @param imgResID ID of image item
	 */
	public DrawerItem(String itemName, int imgResID) {
		this.itemName = itemName;
		this.imgResID = imgResID;
		this.haveTopDivider = false;
	}
	/**
	 * Constructor
	 * @param itemName name of item
	 * @param imgResID ID of image item
	 * @param haveTopDivider set true, false for have top divider
	 */
	public DrawerItem(String itemName, int imgResID, boolean haveTopDivider) {
		this.itemName = itemName;
		this.imgResID = imgResID;
		this.haveTopDivider = haveTopDivider;
	}
	
	public boolean getHaveTopDivider() {
		return haveTopDivider;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getImgResID() {
		return imgResID;
	}

	public void setImgResID(int imgResID) {
		this.imgResID = imgResID;
	}
}
