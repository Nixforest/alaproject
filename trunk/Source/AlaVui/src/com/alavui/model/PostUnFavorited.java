/*
* Post Un-Favorited class
* 
* Version information
*
* Date
* 23-Aug-2014
* Copyright notice
* 
* Modification Logs:
* DATE    AUTHOR DESCRIPTION
*  --------------------------------------------------------
*  23-Aug-2014	NguyenPT	Init coding
*/
package com.alavui.model;

import java.io.Serializable;

/**
 * Model object Post Un-Favorited.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class PostUnFavorited implements Serializable {

	/*
	 * Unfavorite id
	 */
	private int fId;
	/*
	 * User id
	 */
	private int userId;
	/*
	 * post id
	 */
	private int pId;
	
	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final PostUnFavorited post = (PostUnFavorited)o;
		// Add code here
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PostUnFavorited [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
