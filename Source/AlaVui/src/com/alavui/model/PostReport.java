/*
* Post Report class
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
 * Model object Post Report.
 * @author NguyenPT
 */
@SuppressWarnings("serial")
public class PostReport implements Serializable {

	/**
	 * Ip of Report.
	 */
	private int rId;
	/**
	 * Post's Id.
	 */
	private int pId = 0;
	/**
	 * time report.
	 */
	private String time;
	/**
	 * ip.
	 */
	private String ip;
	/**
	 * reason of report.
	 */
	private int reason;	
	
	/**
	 * @return the rId
	 */
	public int getrId() {
		return rId;
	}

	/**
	 * @param rId the rId to set
	 */
	public void setrId(int rId) {
		this.rId = rId;
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
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the reason
	 */
	public int getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(int reason) {
		this.reason = reason;
	}

	/**
	 * Default Constructor.
	 */
	public PostReport(){
		this.pId = 0;
	}
	/**
	 * Constructor.
	 * @param rId		Report ID
	 * @param pId		Post ID
	 * @param time		Time
	 * @param ip		IP
	 * @param reason	Reason
	 */
	public PostReport(int rId, int pId, String time, String ip, int reason){
		this.rId = rId;
		this.pId = pId;
		this.time = time;
		this.ip = ip;
		this.reason = reason;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final PostReport post = (PostReport)o;
		if ((this.pId != post.pId)
				|| (this.time != post.time)
				|| (this.ip != post.ip)
				|| (this.reason != post.reason)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PostReport [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
