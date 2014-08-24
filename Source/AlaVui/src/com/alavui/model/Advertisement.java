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
