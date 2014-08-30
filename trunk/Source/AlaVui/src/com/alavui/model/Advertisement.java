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
*  29-Aug-2014	HuyNV		Add properties
*/
package com.alavui.model;

import java.io.Serializable;

/**
 * Model object Advertisement.
 * @author NguyenPT
 */
@SuppressWarnings("serial")
public class Advertisement implements Serializable {
	/**
	 * Id of Advertisement.
	 */
	private int AID;
	/**
	 * Description of Advertisement.
	 */
	private String description;		
	/**
	 * Code of Advertisement.
	 */
	private String code;	
	/**
	 * Nsfw code of Advertisement.
	 */
	private String nsfwCode;		
	/**
	 * Status of Advertisement (1) = is-active or (2) = non-active.
	 */
	private Boolean active;

	/**
	 * Get id.
	 * @return the aID
	 */
	public int getAID() {
		return AID;
	}

	/**
	 * Set id.
	 * @param aID the aID to set
	 */
	public void setAID(int aID) {
		AID = aID;
	}

	/**
	 * Get description.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get code.
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Set code.
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Get nsfwCode.
	 * @return the nsfwCode
	 */
	public String getNsfwCode() {
		return nsfwCode;
	}

	/**
	 * Set nsfwCode.
	 * @param nsfwCode the nsfwCode to set
	 */
	public void setNsfwCode(String nsfwCode) {
		this.nsfwCode = nsfwCode;
	}

	/**
	 * Get active flag.
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * Set active flag.
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	/**
	 * Default Constructor.
	 */
	public Advertisement() {
		this.AID 			= 0;
		this.description 	= "";
		this.code 			= "";
		this.nsfwCode 		= "";
		this.active = true;
	}
	
	/**
	 * Constructor.
	 * @param aid		ID
	 * @param des		Description
	 * @param code		Code
	 * @param nsfw		NSFW code
	 * @param active	Active flag
	 */
	public Advertisement(int aid, String des, String code, String nsfw, Boolean active) {
		this.AID 			= aid;
		this.description 	= des;
		this.code 			= code;
		this.nsfwCode 		= nsfw;
		this.active 		= active;
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
		if ((this.description 		!= adv.description)
				|| (this.code 		!= adv.code)
				|| (this.nsfwCode 	!= adv.nsfwCode)
				|| (this.active 	!= adv.active)) {
			return false;
		}
		return true;
	}
}
