/*
* Config class
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
 * Model object Config.
 * @author NguyenPT
 */
@SuppressWarnings("serial")
public class Config implements Serializable {
	/**
	 * Name of Setting
	 */
	private String setting;
	/**
	 * Value of Setting
	 */
	private String value;

	/**
	 * Get setting value.
	 * @return the setting
	 */
	public String getSetting() {
		return setting;
	}

	/**
	 * Set setting value.
	 * @param setting the setting to set
	 */
	public void setSetting(String setting) {
		this.setting = setting;
	}

	/**
	 * Get value.
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set value.
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Default Constructor
	 */
	public Config(){
		this.setting = "";
		this.value = "";
	}
	
	/**
	 * Constructor.
	 * @param setting	Value of setting
	 * @param value		Value of value
	 */
	public Config(String setting, String value) {
		this.setting = setting;
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Config config = (Config)o;
		if ((this.setting != config.setting)
				|| (this.value != config.value)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Config [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
