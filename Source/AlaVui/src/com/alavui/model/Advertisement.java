/*
* Advertisement class
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
 * Model object Advertisement.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class Advertisement implements Serializable {
	/*
	 * Id of Advertisement
	 */
	private int AID;			
	/*
	 * Description of Advertisement
	 */
	private String description;		
	/*
	 * Code of Advertisement
	 */
	private String code;	
	/*
	 * Nsfw code of Advertisement
	 */
	private String nsfwCode;		
	/*
	 * Status of Advertisement (1) = is-active or (2) = non-active
	 */
	private Boolean active;			
	
	public int getAID() {
		return AID;
	}

	public void setAID(int aID) {
		AID = aID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNsfwCode() {
		return nsfwCode;
	}

	public void setNsfwCode(String nsfwCode) {
		this.nsfwCode = nsfwCode;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Advertisement [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Advertisement adv = (Advertisement)o;
		// Add code here
		return true;
	}

}
