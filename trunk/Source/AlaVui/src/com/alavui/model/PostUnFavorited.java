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
*  29-Aug-2014	HuyNV		Add properties
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
	/**
	 * Unfavorite id.
	 */
	private int fId;
	/**
	 * User id.
	 */
	private int userId;
	/**
	 * post id.
	 */
	private int pId;	
	
	/**
	 * @return the fId
	 */
	public int getfId() {
		return fId;
	}

	/**
	 * @param fId the fId to set
	 */
	public void setfId(int fId) {
		this.fId = fId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}

	/**
	 * Default Constructor.
	 */
	public PostUnFavorited(){
		this.userId = 0;
		this.pId = 0;
	}
	/**
	 * Constructor
	 * @param fId	Favorite ID
	 * @param uId	User id
	 * @param pId	Post id
	 */
	public PostUnFavorited(int fId, int uId, int pId){
		this.fId = fId;
		this.userId = uId;
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
		if ((this.userId != post.userId)
				|| (this.pId != post.pId)) {
			return false;
		}
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
