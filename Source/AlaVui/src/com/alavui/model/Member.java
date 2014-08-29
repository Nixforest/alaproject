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
	private char verified;
	/*
	 * Status of User (0 for false or 1 for true)
	 */
	private Boolean status;
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
	private int news;
	/*
	 * User's Lang
	 */
	private String myLang;
	/*
	 * Color 1
	 */
	private String color1;
	/*
	 * Color 2
	 */
	private String color2;
	/*
	 * Filter
	 */
	private int filter;
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
	

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the yourViewed
	 */
	public int getYourViewed() {
		return yourViewed;
	}

	/**
	 * @param yourViewed the yourViewed to set
	 */
	public void setYourViewed(int yourViewed) {
		this.yourViewed = yourViewed;
	}

	/**
	 * @return the profileViews
	 */
	public int getProfileViews() {
		return profileViews;
	}

	/**
	 * @param profileViews the profileViews to set
	 */
	public void setProfileViews(int profileViews) {
		this.profileViews = profileViews;
	}

	/**
	 * @return the youViewed
	 */
	public int getYouViewed() {
		return youViewed;
	}

	/**
	 * @param youViewed the youViewed to set
	 */
	public void setYouViewed(int youViewed) {
		this.youViewed = youViewed;
	}

	/**
	 * @return the addTime
	 */
	public String getAddTime() {
		return addTime;
	}

	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the lastLogin
	 */
	public String getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	/**
	 * @return the verified
	 */
	public char getVerified() {
		return verified;
	}

	/**
	 * @param verified the verified to set
	 */
	public void setVerified(char verified) {
		this.verified = verified;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the profilePicture
	 */
	public String getProfilePicture() {
		return profilePicture;
	}

	/**
	 * @param profilePicture the profilePicture to set
	 */
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	/**
	 * @return the rememberMeKey
	 */
	public String getRememberMeKey() {
		return rememberMeKey;
	}

	/**
	 * @param rememberMeKey the rememberMeKey to set
	 */
	public void setRememberMeKey(String rememberMeKey) {
		this.rememberMeKey = rememberMeKey;
	}

	/**
	 * @return the rememberMeTime
	 */
	public Date getRememberMeTime() {
		return rememberMeTime;
	}

	/**
	 * @param rememberMeTime the rememberMeTime to set
	 */
	public void setRememberMeTime(Date rememberMeTime) {
		this.rememberMeTime = rememberMeTime;
	}

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

	/**
	 * @return the lIp
	 */
	public String getlIp() {
		return lIp;
	}

	/**
	 * @param lIp the lIp to set
	 */
	public void setlIp(String lIp) {
		this.lIp = lIp;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the news
	 */
	public int getNews() {
		return news;
	}

	/**
	 * @param news the news to set
	 */
	public void setNews(int news) {
		this.news = news;
	}

	/**
	 * @return the myLang
	 */
	public String getMyLang() {
		return myLang;
	}

	/**
	 * @param myLang the myLang to set
	 */
	public void setMyLang(String myLang) {
		this.myLang = myLang;
	}

	/**
	 * @return the color1
	 */
	public String getColor1() {
		return color1;
	}

	/**
	 * @param color1 the color1 to set
	 */
	public void setColor1(String color1) {
		this.color1 = color1;
	}

	/**
	 * @return the color2
	 */
	public String getColor2() {
		return color2;
	}

	/**
	 * @param color2 the color2 to set
	 */
	public void setColor2(String color2) {
		this.color2 = color2;
	}

	/**
	 * @return the filter
	 */
	public int getFilter() {
		return filter;
	}

	/**
	 * @param filter the filter to set
	 */
	public void setFilter(int filter) {
		this.filter = filter;
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

	/**
	 * @return the twiterId
	 */
	public int getTwiterId() {
		return twiterId;
	}

	/**
	 * @param twiterId the twiterId to set
	 */
	public void setTwiterId(int twiterId) {
		this.twiterId = twiterId;
	}

	/**
	 * @return the cover
	 */
	public String getCover() {
		return cover;
	}

	/**
	 * @param cover the cover to set
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/*
	 * Default Constructor
	 */
	public Member(){
		this.yourViewed = 0;
		this.profileViews = 0;
		this.youViewed = 0;
		this.verified = '1';
		this.status = true;
		this.news = 0;
		this.color1 = "333333";
		this.color2 = "FFFFFF";
		this.filter = 1;
		this.twiterId = 0;
	}
	
	public Member(int uid, String email, String name, String pass, String pwd, String fullname, String gender, String des, String country, int yourviewed,
				  int profileviews, int youviewed, String addtime, String lastlogin, char verified, Boolean status, String profilepicture, String rememberkey, Date remembertime,
				  String ip, String lip, String website, int news, String mylang, String color1, String color2, int filter, int points, int twiter, String cover){
		this.userId = uid;
		this.email = email;
		this.userName = name;
		this.password = pass;
		this.pwd = pwd;
		this.fullName = fullname;
		this.gender = gender;
		this.description = des;
		this.country = country;
		this.yourViewed = yourviewed;
		this.profileViews = profileviews;
		this.youViewed = youviewed;
		this.addTime = addtime;
		this.lastLogin = lastlogin;
		this.verified = verified;
		this.status = status;
		this.profilePicture = profilepicture;
		this.rememberMeKey = rememberkey;
		this.rememberMeTime = remembertime;
		this.ip = ip;
		this.lIp = lip;
		this.website = website;
		this.news = news;
		this.myLang = mylang;
		this.color1 = color1;
		this.color2 = color2;
		this.filter = filter;
		this.point = points;
		this.twiterId = twiter;
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
		if(this.email != member.email || this.userName != member.userName || this.password != member.password || this.pwd != member.pwd || this.fullName != member.fullName ||
		   this.gender != member.gender || this.description != member.description || this.country != member.country || this.yourViewed != member.yourViewed || this.profileViews != member.profileViews || this.youViewed != member.youViewed ||
		   this.addTime != member.addTime || this.lastLogin != member.lastLogin || this.verified != member.verified || this.status != member.status || this.profilePicture != member.profilePicture || this.rememberMeKey != member.rememberMeKey ||
		   this.rememberMeTime != member.rememberMeTime || this.ip != member.ip || this.lIp != member.lIp || this.website != member.website || this.news != member.news || this.myLang != member.myLang || this.color1 != member.color1 || this.color2 != member.color2 ||
		   this.filter != member.filter || this.point != member.point || this.twiterId != member.twiterId || this.cover != member.cover)
			return false;
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
