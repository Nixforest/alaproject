/*
* Static class
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
*  25-Aug-2014	HuyNV		Add properties
*/
package com.alavui.model;

import java.io.Serializable;

/**
 * Model object Static.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class Static implements Serializable {
	/** 
	 * id.
	 */
	private int id;
	/**
	 * title.
	 */
	private String title;
	/**
	 * value.
	 */
	private String value;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Default Constructor.
	 */
	public Static(){
		
	}
	/**
	 * Constructor
	 * @param id		ID
	 * @param title		Title
	 * @param value		Value
	 */
	public Static(int id, String title, String value){
		this.id = id;
		this.title = title;
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
		final Static staticObject = (Static)o;
		if ((this.title != staticObject.title)
				|| (this.value != staticObject.value)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Static [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
