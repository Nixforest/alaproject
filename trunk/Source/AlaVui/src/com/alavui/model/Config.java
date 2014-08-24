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
*/
package com.alavui.model;

import java.io.Serializable;

/**
 * Model object Config.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class Config implements Serializable {

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Config config = (Config)o;
		// Add code here
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Config [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
