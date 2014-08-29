/*
* Post Favorited class
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
 * Model object Post Favorited.
 * @author NguyenPT
 * Add Properties
 * @author HuyNV
 */
@SuppressWarnings("serial")
public class PostFavorited implements Serializable {

	/* 
	 * Favorite ID
	 */
	private int fId;
	/*
	 * user's Id
	 */
	private int userId;
	/*
	 * Id of Post
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

	/*
	 * Default Constructor
	 */
	public PostFavorited(){
		userId = 0;
		pId = 0;
	}
	
	public PostFavorited(int fId,int userId, int pId){
		this.fId = fId;
		this.userId = userId;
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
		final PostFavorited post = (PostFavorited)o;
		if(this.userId != post.userId || this.pId != post.pId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PostFavorited [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
