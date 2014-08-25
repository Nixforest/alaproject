/*
* Member class
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
import java.sql.Date;

/**
 * Model object Member.
 * @author NguyenPT
 *
 */
@SuppressWarnings("serial")
public class Member implements Serializable {

	/*
	 * ID of User
	 */
	private int userId;
	/*
	 * Email of User
	 */
	private String email;
	/*
	 * User's Name
	 */
	private String userName;
	/*
	 * Password of User
	 */
	private String password;
	/*
	 * pwd of User
	 */
	private String pwd;
	/*
	 * Fullname of User
	 */
	private String fullName;
	/*
	 * Gender of User
	 */
	private String gender;
	/*
	 * Desciption of User
	 */
	private String description;
	/*
	 * Country of User
	 */
	private String country;
	/*
	 * Number of view of User's Image
	 */
	private int yourViewed;
	/*
	 * Number of profile's view
	 */
	private int profileViews;
	/*
	 * Number of Image that User viewd
	 */
	private int youViewed;
	/*
	 * Time that User added
	 */
	private String addTime;
	/*
	 * Last Login's Time
	 */
	private String lastLogin;
	/*
	 * Check whether user is verified or not. 1 if verified or 0 instead
	 */
	private int verified = 1;
	/*
	 * Status of User (0 for false or 1 for true)
	 */
	private Boolean status = true;
	/*
	 * Profile picture of User
	 */
	private String profilePicture;
	/*
	 * Key for remember user
	 */
	private String rememberMeKey;
	/*
	 * Time for remember user
	 */
	private Date rememberMeTime; 
	/*
	 * User's IP
	 */
	private String ip;
	/*
	 * Key of User's IP
	 */
	private String lIp;
	/*
	 * Website of User
	 */
	private String website;
	/*
	 * Check whether user is new member or not?
	 */
	private int news = 0;
	/*
	 * User's Lang
	 */
	private String myLang;
	/*
	 * Color 1
	 */
	private String color1 = "333333";
	/*
	 * Color 2
	 */
	private String color2 = "FFFFFF";
	/*
	 * Filter
	 */
	private int filter = 1;
	/*
	 * User's point
	 */
	private int point;
	/*
	 * User's Twiter ID
	 */
	private int twiterId;
	/*
	 * Cover
	 */
	private String cover;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYourViewed() {
		return yourViewed;
	}

	public void setYourViewed(int yourViewed) {
		this.yourViewed = yourViewed;
	}

	public int getProfileViews() {
		return profileViews;
	}

	public void setProfileViews(int profileViews) {
		this.profileViews = profileViews;
	}

	public int getYouViewed() {
		return youViewed;
	}

	public void setYouViewed(int youViewed) {
		this.youViewed = youViewed;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getRememberMeKey() {
		return rememberMeKey;
	}

	public void setRememberMeKey(String rememberMeKey) {
		this.rememberMeKey = rememberMeKey;
	}

	public Date getRememberMeTime() {
		return rememberMeTime;
	}

	public void setRememberMeTime(Date rememberMeTime) {
		this.rememberMeTime = rememberMeTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getlIp() {
		return lIp;
	}

	public void setlIp(String lIp) {
		this.lIp = lIp;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getNews() {
		return news;
	}

	public void setNews(int news) {
		this.news = news;
	}

	public String getMyLang() {
		return myLang;
	}

	public void setMyLang(String myLang) {
		this.myLang = myLang;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public int getFilter() {
		return filter;
	}

	public void setFilter(int filter) {
		this.filter = filter;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTwiterId() {
		return twiterId;
	}

	public void setTwiterId(int twiterId) {
		this.twiterId = twiterId;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Member member = (Member)o;
		// Add code here
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
