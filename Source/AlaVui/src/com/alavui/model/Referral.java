/*
* Referral class
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
 * Model object Referral.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class Referral implements Serializable {
	/**
	 * Ref id.
	 */
	private int rId;
	/**
	 * User id.
	 */
	private int userId ;
	/**
	 * referred.
	 */
	private int referred ;
	/**
	 * Money.
	 */
	private float money;
	/**
	 * Time added.
	 */
	private String timeAdded;
	/**
	 * Ip.
	 */
	private String ip;
	/**
	 * Status
	 */
	private int status ;
	
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
	 * @return the referred
	 */
	public int getReferred() {
		return referred;
	}

	/**
	 * @param referred the referred to set
	 */
	public void setReferred(int referred) {
		this.referred = referred;
	}

	/**
	 * @return the money
	 */
	public float getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(float money) {
		this.money = money;
	}

	/**
	 * @return the timeAdded
	 */
	public String getTimeAdded() {
		return timeAdded;
	}

	/**
	 * @param timeAdded the timeAdded to set
	 */
	public void setTimeAdded(String timeAdded) {
		this.timeAdded = timeAdded;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Default Constructor.
	 */
	public Referral(){
		this.userId = 0;
		this.referred  = 0;
		this.status = 0;
	}
	/**
	 * Constructor
	 * @param rId
	 * @param userId
	 * @param referred
	 * @param money
	 * @param timeAdded
	 * @param ip
	 * @param status
	 */
	public Referral(int rId, int userId, int referred, int money, String timeAdded, String ip, int status){
		this.rId = rId;
		this.userId = userId;
		this.referred = referred;
		this.money = money;
		this.timeAdded = timeAdded;
		this.ip = ip;
		this.status = status;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Referral referral = (Referral)o;
		if ((this.userId != referral.userId)
				|| (this.referred != referral.referred)
				|| (this.money != referral.money)
				|| (this.timeAdded != referral.timeAdded)
				|| (this.ip != referral.ip)
				|| (this.status != referral.status)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Referral [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
