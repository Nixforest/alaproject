/*
* Level class
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
 * Model object Level.
 * @author NguyenPT
 * Add Properties
 * @author HuyNV
 */
@SuppressWarnings("serial")
public class Level implements Serializable {

	/*
	 * ID of level
	 */
	private int lid;
	/*
	 * Number of level
	 */
	private int level;
	/*
	 * Point of level
	 */
	private int point;

	/**
	 * @return the lid
	 */
	public int getLid() {
		return lid;
	}

	/**
	 * @param lid the lid to set
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the point
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/*
	 * Default Constructor
	 */
	public Level(){
		
	}
	
	public Level(int id, int level, int point){
		this.lid = id;
		this.level = level;
		this.point = point;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Level level = (Level)o;
		if(this.level != level.level || this.point != level.point)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Level [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}