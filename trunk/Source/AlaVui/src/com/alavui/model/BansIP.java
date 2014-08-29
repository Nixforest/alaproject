/*
* BansIP class
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
 * Model object BansIP.
 * @author NguyenPT
 * Add properties
 * @author HuyNV
 */
@SuppressWarnings("serial")
public class BansIP implements Serializable {

	/*
	 * Bans IP
	 */
	private String ip;
	
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
	/*
	 * Default Constructor
	 */
	
	public BansIP(){
		
	}
	
	public BansIP(String ip){
		this.ip = ip;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final BansIP bansIP = (BansIP)o;
		if(this.ip != bansIP.ip)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "BansIP [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
