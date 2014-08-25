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

	/*
	 * Ref id
	 */
	private int rId;
	/*
	 * User id
	 */
	private int userId = 0;
	/*
	 * referred
	 */
	private int referred = 0;
	/*
	 * Money
	 */
	private float money;
	/*
	 * Time added
	 */
	private String timeAdded;
	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReferred() {
		return referred;
	}

	public void setReferred(int referred) {
		this.referred = referred;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(String timeAdded) {
		this.timeAdded = timeAdded;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/*
	 * Ip
	 */
	private String ip;
	/*
	 * Status
	 */
	private int status = 0;
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Referral referral = (Referral)o;
		// Add code here
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
