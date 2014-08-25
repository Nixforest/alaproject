/*
* Post class
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
 * Model object Post.
 * @author NguyenPT.
 *
 */
@SuppressWarnings("serial")
public class Post implements Serializable {

	/*
	 * ID of Post
	 */
	private int pId;
	/*
	 * Id of user who post this image
	 */
	private int userId;
	/*
	 * name of post
	 */
	private String story;
	/*
	 * Tag of post
	 */
	private String tag;
	/*
	 * Source
	 */
	private String source;
	/*
	 * nsfw
	 */
	private String nsfw;
	/*
	 * Name of picture or video of Post
	 */
	private String pic;
	/*
	 * youtube key of Image if Image is a Video
	 */
	private String youTubeKey;
	/*
	 * Fod key 
	 */
	private String fodKey;
	/*
	 * url of Image
	 */
	private String url;
	/*
	 * time that Image is added
	 */
	private String timeAdded;
	/*
	 * Date that Image is added
	 */
	private Date dateAdded;
	/*
	 * active? y/n
	 */
	private char active;
	/*
	 * phase
	 */
	private int phase = 0;
	/*
	 * Number of Favorite clicked
	 */
	private int favClicks = 0;
	/*
	 * last view
	 */
	private String lastViewed;
	/*
	 * mod_yes
	 */
	private int modYes = 0;
	/*
	 * mod_no
	 */
	private int modNo = 0;
	/*
	 * pip 1
	 */
	private String pip;
	/*
	 * pip 2
	 */
	private String pip2;
	/*
	 * Number of Unfavorite clicked
	 */
	private int unfavClicked = 0;
	/*
	 * fix
	 */
	private int fix = 0;
	/*
	 * short
	 */
	private String shortDes;
	/*
	 * ttime
	 */
	private String tTime;
	/*
	 * htime
	 */
	private String hTime;
	/*
	 * feat
	 */
	private int feat = 0;
	/*
	 * rec
	 */
	private int rec = 0;
	/*
	 * view
	 */
	private int view = 0;
	/*
	 * bulk
	 */
	private char bulk = '0';
	/*
	 * post content 
	 */
	private String postContent;
	
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getNsfw() {
		return nsfw;
	}

	public void setNsfw(String nsfw) {
		this.nsfw = nsfw;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getYouTubeKey() {
		return youTubeKey;
	}

	public void setYouTubeKey(String youTubeKey) {
		this.youTubeKey = youTubeKey;
	}

	public String getFodKey() {
		return fodKey;
	}

	public void setFodKey(String fodKey) {
		this.fodKey = fodKey;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(String timeAdded) {
		this.timeAdded = timeAdded;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public int getFavClicks() {
		return favClicks;
	}

	public void setFavClicks(int favClicks) {
		this.favClicks = favClicks;
	}

	public String getLastViewed() {
		return lastViewed;
	}

	public void setLastViewed(String lastViewed) {
		this.lastViewed = lastViewed;
	}

	public int getModYes() {
		return modYes;
	}

	public void setModYes(int modYes) {
		this.modYes = modYes;
	}

	public int getModNo() {
		return modNo;
	}

	public void setModNo(int modNo) {
		this.modNo = modNo;
	}

	public String getPip() {
		return pip;
	}

	public void setPip(String pip) {
		this.pip = pip;
	}

	public String getPip2() {
		return pip2;
	}

	public void setPip2(String pip2) {
		this.pip2 = pip2;
	}

	public int getUnfavClicked() {
		return unfavClicked;
	}

	public void setUnfavClicked(int unfavClicked) {
		this.unfavClicked = unfavClicked;
	}

	public int getFix() {
		return fix;
	}

	public void setFix(int fix) {
		this.fix = fix;
	}

	public String getShortDes() {
		return shortDes;
	}

	public void setShortDes(String shortDes) {
		this.shortDes = shortDes;
	}

	public String gettTime() {
		return tTime;
	}

	public void settTime(String tTime) {
		this.tTime = tTime;
	}

	public String gethTime() {
		return hTime;
	}

	public void sethTime(String hTime) {
		this.hTime = hTime;
	}

	public int getFeat() {
		return feat;
	}

	public void setFeat(int feat) {
		this.feat = feat;
	}

	public int getRec() {
		return rec;
	}

	public void setRec(int rec) {
		this.rec = rec;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public char getBulk() {
		return bulk;
	}

	public void setBulk(char bulk) {
		this.bulk = bulk;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Post post = (Post)o;
		// Add code here
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
