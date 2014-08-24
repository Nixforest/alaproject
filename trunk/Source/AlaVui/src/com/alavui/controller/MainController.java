/*
* Main Controller class
* 
* Version information
*
* Date
* 24-Aug-2014
* Copyright notice
* 
* Modification Logs:
* DATE    AUTHOR DESCRIPTION
*  --------------------------------------------------------
*  24-Aug-2014	NguyenPT	Init coding
*/
package com.alavui.controller;

import java.util.List;

import com.alavui.model.Advertisement;
import com.alavui.model.BansIP;
import com.alavui.model.Config;
import com.alavui.model.DataAccessObject;
import com.alavui.model.Level;
import com.alavui.model.Member;
import com.alavui.model.Post;
import com.alavui.model.PostFavorited;
import com.alavui.model.PostReport;
import com.alavui.model.PostUnFavorited;
import com.alavui.model.Referral;
import com.alavui.model.Static;

/**
 * Main controller.
 * @author NguyenPT
 *
 */
public enum MainController {
	/**
	 * Instance of class.
	 */
	INSTANCE;
	/**
	 * Get data from database.
	 * @param c Class object.
	 * @param numberOfRow Number of record want to get.
	 * @return List of object.
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> getData(Class<T> c, int numberOfRow) {
		// Return null
		List<T> listObj = null;
		// Check if parameter is Advertisement class
		if (c.equals(Advertisement.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListAdvertisement(numberOfRow);
		}
		// Check if parameter is BansIP class
		if (c.equals(BansIP.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListBansIP(numberOfRow);
		}
		// Check if parameter is Config class
		if (c.equals(Config.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListConfig(numberOfRow);
		}
		// Check if parameter is Level class
		if (c.equals(Level.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListLevel(numberOfRow);
		}
		// Check if parameter is Member class
		if (c.equals(Member.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListMember(numberOfRow);
		}
		// Check if parameter is Post class
		if (c.equals(Post.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListPost(numberOfRow);
		}
		// Check if parameter is PostFavorited class
		if (c.equals(PostFavorited.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListPostFavorited(numberOfRow);
		}
		// Check if parameter is PostReport class
		if (c.equals(PostReport.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListPostReport(numberOfRow);
		}
		// Check if parameter is PostUnFavorited class
		if (c.equals(PostUnFavorited.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListPostUnFavorited(numberOfRow);
		}
		// Check if parameter is Referral class
		if (c.equals(Referral.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListReferral(numberOfRow);
		}
		// Check if parameter is Static class
		if (c.equals(Static.class)) {
			listObj = (List<T>)DataAccessObject.
					INSTANCE.getListStatic(numberOfRow);
		}
		// Return value
		return listObj;
	}
}
