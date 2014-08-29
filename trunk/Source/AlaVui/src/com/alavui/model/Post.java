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

import android.hardware.Camera.Face;

/**
 * Model object Post.
 * @author NguyenPT.
 * Add Properties
 * @author HuyNV
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
	private int nsfw;
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
	private int unfavClicks = 0;
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
	
	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}

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
	 * @return the story
	 */
	public String getStory() {
		return story;
	}

	/**
	 * @param story the story to set
	 */
	public void setStory(String story) {
		this.story = story;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the nsfw
	 */
	public int getNsfw() {
		return nsfw;
	}

	/**
	 * @param nsfw the nsfw to set
	 */
	public void setNsfw(int nsfw) {
		this.nsfw = nsfw;
	}

	/**
	 * @return the pic
	 */
	public String getPic() {
		return pic;
	}

	/**
	 * @param pic the pic to set
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * @return the youTubeKey
	 */
	public String getYouTubeKey() {
		return youTubeKey;
	}

	/**
	 * @param youTubeKey the youTubeKey to set
	 */
	public void setYouTubeKey(String youTubeKey) {
		this.youTubeKey = youTubeKey;
	}

	/**
	 * @return the fodKey
	 */
	public String getFodKey() {
		return fodKey;
	}

	/**
	 * @param fodKey the fodKey to set
	 */
	public void setFodKey(String fodKey) {
		this.fodKey = fodKey;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the timeAdded
	 */
	public String getTimeAdded() {
		return timeAdded;
	}

	/**
	 * @param timeAdded the timeAdded to set
	 */
	public void setTimeAdded(String timeAdded) {
		this.timeAdded = timeAdded;
	}

	/**
	 * @return the dateAdded
	 */
	public Date getDateAdded() {
		return dateAdded;
	}

	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	/**
	 * @return the active
	 */
	public char getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(char active) {
		this.active = active;
	}

	/**
	 * @return the phase
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * @param phase the phase to set
	 */
	public void setPhase(int phase) {
		this.phase = phase;
	}

	/**
	 * @return the favClicks
	 */
	public int getFavClicks() {
		return favClicks;
	}

	/**
	 * @param favClicks the favClicks to set
	 */
	public void setFavClicks(int favClicks) {
		this.favClicks = favClicks;
	}

	/**
	 * @return the lastViewed
	 */
	public String getLastViewed() {
		return lastViewed;
	}

	/**
	 * @param lastViewed the lastViewed to set
	 */
	public void setLastViewed(String lastViewed) {
		this.lastViewed = lastViewed;
	}

	/**
	 * @return the modYes
	 */
	public int getModYes() {
		return modYes;
	}

	/**
	 * @param modYes the modYes to set
	 */
	public void setModYes(int modYes) {
		this.modYes = modYes;
	}

	/**
	 * @return the modNo
	 */
	public int getModNo() {
		return modNo;
	}

	/**
	 * @param modNo the modNo to set
	 */
	public void setModNo(int modNo) {
		this.modNo = modNo;
	}

	/**
	 * @return the pip
	 */
	public String getPip() {
		return pip;
	}

	/**
	 * @param pip the pip to set
	 */
	public void setPip(String pip) {
		this.pip = pip;
	}

	/**
	 * @return the pip2
	 */
	public String getPip2() {
		return pip2;
	}

	/**
	 * @param pip2 the pip2 to set
	 */
	public void setPip2(String pip2) {
		this.pip2 = pip2;
	}

	/**
	 * @return the unfavClicks
	 */
	public int getunfavClicks() {
		return unfavClicks;
	}

	/**
	 * @param unfavClicks the unfavClicks to set
	 */
	public void setunfavClicks(int unfavClicks) {
		this.unfavClicks = unfavClicks;
	}

	/**
	 * @return the fix
	 */
	public int getFix() {
		return fix;
	}

	/**
	 * @param fix the fix to set
	 */
	public void setFix(int fix) {
		this.fix = fix;
	}

	/**
	 * @return the shortDes
	 */
	public String getShortDes() {
		return shortDes;
	}

	/**
	 * @param shortDes the shortDes to set
	 */
	public void setShortDes(String shortDes) {
		this.shortDes = shortDes;
	}

	/**
	 * @return the tTime
	 */
	public String gettTime() {
		return tTime;
	}

	/**
	 * @param tTime the tTime to set
	 */
	public void settTime(String tTime) {
		this.tTime = tTime;
	}

	/**
	 * @return the hTime
	 */
	public String gethTime() {
		return hTime;
	}

	/**
	 * @param hTime the hTime to set
	 */
	public void sethTime(String hTime) {
		this.hTime = hTime;
	}

	/**
	 * @return the feat
	 */
	public int getFeat() {
		return feat;
	}

	/**
	 * @param feat the feat to set
	 */
	public void setFeat(int feat) {
		this.feat = feat;
	}

	/**
	 * @return the rec
	 */
	public int getRec() {
		return rec;
	}

	/**
	 * @param rec the rec to set
	 */
	public void setRec(int rec) {
		this.rec = rec;
	}

	/**
	 * @return the view
	 */
	public int getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(int view) {
		this.view = view;
	}

	/**
	 * @return the bulk
	 */
	public char getBulk() {
		return bulk;
	}

	/**
	 * @param bulk the bulk to set
	 */
	public void setBulk(char bulk) {
		this.bulk = bulk;
	}

	/**
	 * @return the postContent
	 */
	public String getPostContent() {
		return postContent;
	}

	/**
	 * @param postContent the postContent to set
	 */
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	/*
	 * Default Constructor
	 */
	public Post(){
		this.userId = 0;
		this.nsfw = 0;
		this.dateAdded = new Date(0000,00,00);
		this.phase = 0;
		this.favClicks = 0;
		this.modYes = 0;
		this.modNo = 0;
		this.unfavClicks = 0;
		this.fix = 0;
		this.feat = 0;
		this.rec = 0;
		this.view = 0;
		this.bulk = '0';
	}
	
	public Post(int pId, int userId, String story, String tags, String source, int nsfw, String pic, String youtubeKey, String fodKey, String url, String timeAdded, 
				Date dateAdded, char active, int phase, int favClicks, String lastViewed, int modYes, int modNo, String pip, String pip2, int unfavClicks, int fix,
				String shortDes, String ttime, String htime, int feat, int rec, int view, char bulk, String postContent){
		this.pId = pId;
		this.userId = userId;
		this.story = story;
		this.tag = tags;
		this.source = source;
		this.nsfw = nsfw;
		this.pic = pic;
		this.youTubeKey = youtubeKey;
		this.fodKey = fodKey;
		this.url = url;
		this.timeAdded = timeAdded;
		this.dateAdded = dateAdded;
		this.active = active;
		this.phase = phase;
		this.favClicks = favClicks;
		this.lastViewed = lastViewed;
		this.modYes = modYes;
		this.modNo = modNo;
		this.pip = pip;
		this.pip2 = pip2;
		this.unfavClicks = unfavClicks;
		this.fix = fix;
		this.shortDes = shortDes;
		this.tTime = ttime;
		this.hTime = htime;
		this.feat = feat;
		this.rec = rec;
		this.view = view;
		this.bulk = bulk;
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
		if(this.userId != post.userId || this.story != post.story || this.tag != post.tag || this.source != post.source || this.nsfw != post.nsfw || this.pic != post.pic || this.youTubeKey != post.youTubeKey ||
			this.fodKey != post.fodKey || this.url != post.url || this.timeAdded != post.timeAdded || this.dateAdded != post.dateAdded || this.active != post.active || this.phase != post.phase || this.favClicks != post.favClicks || this.lastViewed != post.lastViewed ||
			this.modYes != post.modYes || this.modNo != post.modNo || this.pip != post.pip || this.pip2 != post.pip2 || this.unfavClicks != post.unfavClicks || this.fix != post.fix || this.shortDes != post.shortDes || this.tTime != post.tTime || this.hTime != post.hTime ||
			this.feat != post.feat || this.rec != post.rec || this.view != post.view || this.bulk != post.bulk || this.postContent != post.postContent)
			return false;
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
