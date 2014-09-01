/*
* Data access class
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
*  30-Aug-2014	HuyNA		Implement DataAccessObject
*/
package com.alavui.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.alavui.util.GlobalVariable;
import com.alavui.util.Utility;

/**
 * Data Access object.
 * @author NguyenPT
 *
 */
public enum DataAccessObject {
	/*
	 * Instance of class.
	 */
	INSTANCE;
	/**
	 * Get list of Advertisement objects from database.
	 * @param numberOfRow	Number of record want to get.
	 * @return List of Advertisement objects.
	 */
	public List<Advertisement> getListAdvertisement(int numberOfRow) {
		List<Advertisement> listAdvert = null;
		// Add code here
		return listAdvert;
	}
	/**
	 * Get Advertisement object from database by ID.
	 * @param id Advertisement id.
	 * @return If id is valid, return Advertisement object with match id, null otherwise.
	 */
	public Advertisement getAdvertisementByID(int id) {
		Advertisement adv = null;
		// Add code here
		return adv;
	}
	/**
	 * Get list of BansIP objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of BansIP objects.
	 */
	public List<BansIP> getListBansIP(int numberOfRow) {
		List<BansIP> listBansIP = null;
		// Add code here
		return listBansIP;
	}
	/**
	 * Get BansIP object from database by ID.
	 * @param id BansIP id.
	 * @return If id is valid, return BansIP object with match id, null otherwise.
	 */
	public BansIP getBansIPByID(int id) {
		BansIP bansIP = null;
		// Add code here
		return bansIP;
	}
	/**
	 * Get list of Config objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Config objects.
	 */
	public List<Config> getListConfig(int numberOfRow) {
		List<Config> listConfig = null;
		// Add code here
		return listConfig;
	}
	/**
	 * Get Config object from database by ID.
	 * @param id Config id.
	 * @return If id is valid, return Config object with match id, null otherwise.
	 */
	public Config getConfigByID(int id) {
		Config config = null;
		// Add code here
		return config;
	}
	/**
	 * Get list of Level objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Level objects.
	 */
	public List<Level> getListLevel(int numberOfRow) {
		List<Level> listLevel = null;
		// Add code here
		return listLevel;
	}
	/**
	 * Get Level object from database by ID.
	 * @param id Level id.
	 * @return If id is valid, return Level object with match id, null otherwise.
	 */
	public Level getLevelByID(int id) {
		Level level = null;
		// Add code here
		return level;
	}
	/**
	 * Get list of Member objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Member objects.
	 */
	public List<Member> getListMember(int numberOfRow) {
		List<Member> listMember = new ArrayList<Member>();
		JSONArray members = null;
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_MEMBER_ALL,
				GlobalVariable.GET_METHOD, lstParams);
		try {
			int success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if (success == GlobalVariable.SUCCESS_VALUE) {
				members = jsonObject.getJSONArray(GlobalVariable.TABLE_MEMBERS);
				for (int i = 0; i < members.length(); i++) {
					Member member = new Member();
					JSONObject jsonMember = members.getJSONObject(i);
					member.setUserId(jsonMember.getInt(GlobalVariable.USER_ID));
					member.setEmail(jsonMember.getString(GlobalVariable.EMAIL));
					member.setUserName(jsonMember.getString(GlobalVariable.USER_NAME));
					member.setPassword(jsonMember.getString(GlobalVariable.PASSWORD));
					member.setFullName(jsonMember.getString(GlobalVariable.FULLNAME));
					listMember.add(member);
					/* Check number row */
					if (i > (numberOfRow - 1)) {
						return listMember;
					}
				}
			}
		} catch(JSONException e) {
			e.printStackTrace();
			return null;
		}
		return listMember;
	}
	/**
	 * Get Member object from database by ID.
	 * @param id Member id.
	 * @return If id is valid, return Member object with match id, null otherwise.
	 */
	public Member getMemberByID(int id) {
		Member member = new Member();
		int success = 0;
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		lstParams.add(new BasicNameValuePair(GlobalVariable.USER_ID, String.valueOf(id)));
		
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_MEMBER_DETAIL,
				GlobalVariable.GET_METHOD, lstParams);
		
		try {
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if (success == GlobalVariable.SUCCESS_VALUE) {
				JSONArray memberArray = jsonObject.getJSONArray("member");
				JSONObject jsonMember = memberArray.getJSONObject(0);
				/* Set value */
				member.setUserId(jsonMember.getInt(GlobalVariable.USER_ID));
				member.setEmail(jsonMember.getString(GlobalVariable.EMAIL));
				member.setUserName(jsonMember.getString(GlobalVariable.USER_NAME));
				member.setPassword(jsonMember.getString(GlobalVariable.PASSWORD));
				member.setFullName(jsonObject.getString(GlobalVariable.FULLNAME));
			}
		} catch(JSONException e) {
			e.printStackTrace();
			return null;
		}
		return member;
	}
	
	/***
	 * Insert new member to database
	 * @param member: Object Member
	 * @return 0: insert fail; 1: insert successful
	 */
	public int insertMember(Member member)
	{
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		int success = 0;
		int status = 0;
		/* Convert boolean to integer */
		if(member.getStatus()){
			status = 1;
		}
		/* Add param */
		lstParams.add(new BasicNameValuePair(GlobalVariable.EMAIL, member.getEmail()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.USER_NAME, member.getUserName()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.PASSWORD, member.getPassword()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.PWD, member.getPwd()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.FULLNAME, member.getFullName()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.GENDER, member.getGender()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.DESCRIPTION, member.getDescription()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.COUNTRY, member.getCountry()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.YOUR_VIEWED, String.valueOf(member.getYourViewed())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.PROFILE_VIEWS, String.valueOf(member.getProfileViews())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.YOU_VIEWED, String.valueOf(member.getYouViewed())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.ADD_TIME, member.getAddTime()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.LAST_LOGIN, member.getLastLogin()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.VERIFIED, String.valueOf(member.getVerified())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.STATUS, String.valueOf(status)));
		lstParams.add(new BasicNameValuePair(GlobalVariable.PROFILE_PICTURE, member.getProfilePicture()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.REMEMBER_ME_KEY, member.getRememberMeKey()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.REMEMBER_ME_TIME, member.getRememberMeTime().toString()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.IP, member.getIp()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.LIP, member.getlIp()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.WEBSITE, member.getWebsite()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.NEWS, String.valueOf(member.getNews())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.MY_LANG, member.getMyLang()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.COLOR_1, member.getColor1()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.COLOR_2, member.getColor2()));
		lstParams.add(new BasicNameValuePair(GlobalVariable.FILTER, String.valueOf(member.getFilter())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.POINTS, String.valueOf(member.getPoint())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.TWITTER_ID, String.valueOf(member.getTwiterId())));
		lstParams.add(new BasicNameValuePair(GlobalVariable.COVER, String.valueOf(member.getCover())));
		
		/* Get JSON object via POST method */
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_MEMBER_INSERT,
				GlobalVariable.POST_METHOD, lstParams);
		
		try {
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
		} catch (JSONException e) {
			e.printStackTrace();
			success = 0;
		}
		/* Return result */
		return success;
	}
	
	/**
	 * Get list of Post objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Post objects.
	 */
	public List<Post> getListPost(int numberOfRow) {
		List<Post> listPost = new ArrayList<Post>();
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		JSONArray posts = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat(GlobalVariable.DATE_FORMAT);
		int success = 0;
		
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_POST_ALL,
				GlobalVariable.GET_METHOD, lstParams);
		try {
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if (success == GlobalVariable.SUCCESS_VALUE) {
				posts = jsonObject.getJSONArray("posts");
				for (int i = 0; i < posts.length(); i++) {
					Post post = new Post();
					/* Get object JSON */
					JSONObject objectPost = posts.getJSONObject(i);
					post.setpId(objectPost.getInt(GlobalVariable.POST_ID));
					post.setUserId(objectPost.getInt(GlobalVariable.USER_ID));
					post.setStory(jsonObject.getString(GlobalVariable.POST_STORY));
					post.setPic(jsonObject.getString(GlobalVariable.POST_PIC));
					post.setYouTubeKey(jsonObject.getString(GlobalVariable.POST_YOUTUBE_KEY));
					post.setUrl(jsonObject.getString(GlobalVariable.POST_URL));
					post.setTimeAdded(jsonObject.getString(GlobalVariable.POST_TIME_ADDED));
					post.setDateAdded((Date)dateFormat.parse(jsonObject.getString(GlobalVariable.POST_DATE_ADDED)));
					post.setFavClicks(jsonObject.getInt(GlobalVariable.POST_FAVORITE_CLICKS));
					post.setunfavClicks(jsonObject.getInt(GlobalVariable.POST_UNFAVORITE_CLICKS));
					post.setView(jsonObject.getInt(GlobalVariable.POST_VIEW));
					/* Set to list */
					listPost.add(post);
					/* Check row number */
					if( i > numberOfRow - 1){
						return listPost;
					}
				}
			}
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
		return listPost;
	}
	/**
	 * Get Post object from database by ID.
	 * @param id Post id.
	 * @return If id is valid, return Post object with match id, null otherwise.
	 */
	public Post getPostByID(int id) {
		Post post = new Post();
		int success = 0;
		SimpleDateFormat dateFormat = new SimpleDateFormat(GlobalVariable.DATE_FORMAT);
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		lstParams.add(new BasicNameValuePair(GlobalVariable.POST_ID, String.valueOf(id)));
		/* Get JSON object from URL via GET methos */
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_POST_DETAIL,
				GlobalVariable.GET_METHOD, lstParams);
		try{
			/* Get result from JSON */
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if(success == GlobalVariable.SUCCESS_VALUE){
				JSONArray postArray = jsonObject.getJSONArray("post");
				/* Get value from JSON */
				JSONObject objectPost = postArray.getJSONObject(0);
				/* Set value to object */
				post.setpId(objectPost.getInt(GlobalVariable.POST_ID));
				post.setUserId(objectPost.getInt(GlobalVariable.USER_ID));
				post.setStory(objectPost.getString(GlobalVariable.POST_STORY));
				post.setPic(objectPost.getString(GlobalVariable.POST_PIC));
				post.setYouTubeKey(objectPost.getString(GlobalVariable.POST_YOUTUBE_KEY));
				post.setUrl(objectPost.getString(GlobalVariable.POST_URL));
				post.setTimeAdded(objectPost.getString(GlobalVariable.POST_TIME_ADDED));
				post.setDateAdded((Date)dateFormat.parse(objectPost.getString(GlobalVariable.POST_DATE_ADDED)));
				post.setFavClicks(jsonObject.getInt(GlobalVariable.POST_FAVORITE_CLICKS));
				post.setunfavClicks(jsonObject.getInt(GlobalVariable.POST_UNFAVORITE_CLICKS));
				post.setView(jsonObject.getInt(GlobalVariable.POST_VIEW));
			}
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return post;
	}
	/**
	 * Get list of PostFavorited objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of PostFavorited objects.
	 */
	public List<PostFavorited> getListPostFavorited(int numberOfRow) {
		List<PostFavorited> listPostFav = new ArrayList<PostFavorited>();
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		JSONArray postsFavorited = null;
		int success = 0;
		/* Get JSON object Post favorited from URL via POST method */
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_POST_FAVORITED_ALL,
				GlobalVariable.GET_METHOD, lstParams);
		try{
			/* Get result from JSON object */
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if(success == GlobalVariable.SUCCESS_VALUE){
				/* Get array object */
				postsFavorited = jsonObject.getJSONArray("posts_favorited");
				for(int i = 0; i < postsFavorited.length(); i++){
					PostFavorited favorited = new PostFavorited();
					JSONObject objectFavorited = postsFavorited.getJSONObject(i);
					favorited.setfId(objectFavorited.getInt(GlobalVariable.FAVORITED_ID));
					favorited.setUserId(objectFavorited.getInt(GlobalVariable.POST_ID));
					favorited.setpId(objectFavorited.getInt(GlobalVariable.POST_ID));
					/* Set object to list */
					listPostFav.add(favorited);
					/* Check number records */
					if(i > numberOfRow - 1){
						return listPostFav;
					}
				}
			}
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		}
		return listPostFav;
	}
	/**
	 * Get PostFavorited object from database by ID.
	 * @param id PostFavorited id.
	 * @return If id is valid, return PostFavorited object with match id, null otherwise.
	 */
	public PostFavorited getPostFavoritedByID(int id) {
		PostFavorited postFav = new PostFavorited();
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		int success = 0;
		lstParams.add(new BasicNameValuePair(GlobalVariable.FAVORITED_ID, String.valueOf(id)));
		
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_POST_FAVORITED_DETAIL,
				GlobalVariable.GET_METHOD, lstParams);
		
		try{
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if(success == GlobalVariable.SUCCESS_VALUE){
				JSONArray favArray = jsonObject.getJSONArray("post_favorited");
				JSONObject objectFav = favArray.getJSONObject(0);
				/**/
				postFav.setfId(objectFav.getInt(GlobalVariable.FAVORITED_ID));
				postFav.setUserId(objectFav.getInt(GlobalVariable.USER_ID));
				postFav.setpId(objectFav.getInt(GlobalVariable.POST_ID));
			}
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		}
		
		return postFav;
	}
	/**
	 * Get list of PostReport objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of PostReport objects.
	 */
	public List<PostReport> getListPostReport(int numberOfRow) {
		List<PostReport> listPostReport = new ArrayList<PostReport>();
		List<NameValuePair> lstParams = new ArrayList<NameValuePair>();
		JSONArray postReports = null;
		int success = 0;
		JSONObject jsonObject = Utility.makeHttpRequest(GlobalVariable.URL_POST_REPORT_ALL,
				GlobalVariable.GET_METHOD, lstParams);
		try{
			success = jsonObject.getInt(GlobalVariable.SUCCESS_STRING);
			if(success == GlobalVariable.SUCCESS_VALUE){
				postReports = jsonObject.getJSONArray(GlobalVariable.POSTS_REPORTS);
				for(int i = 0; i < postReports.length(); i++){
					PostReport report = new PostReport();
					/* Get JSON object at row */
					JSONObject jsonReport = postReports.getJSONObject(i);
					report.setpId(jsonReport.getInt(GlobalVariable.REPORT_ID));
					report.setReason(jsonReport.getInt(GlobalVariable.POST_ID));
					report.setTime(jsonReport.getString(GlobalVariable.REPORT_TIME));
					report.setIp(jsonReport.getString(GlobalVariable.IP));
					report.setReason(jsonReport.getInt(GlobalVariable.REPORT_REASON));
					/* Add object to list */
					listPostReport.add(report);
					/* Check row to get */
					if(i > numberOfRow - 1){
						return listPostReport;
					}
				}
			}
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		}
		return listPostReport;
	}
	/**
	 * Get PostReport object from database by ID.
	 * @param id PostReport id.
	 * @return If id is valid, return PostReport object with match id, null otherwise.
	 */
	public PostReport getPostReportByID(int id) {
		PostReport postReport = null;
		// Add code here
		return postReport;
	}
	/**
	 * Get list of PostUnFavorited objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of PostUnFavorited objects.
	 */
	public List<PostUnFavorited> getListPostUnFavorited(int numberOfRow) {
		List<PostUnFavorited> listPostUnFav = null;
		// Add code here
		return listPostUnFav;
	}
	/**
	 * Get PostUnFavorited object from database by ID.
	 * @param id PostUnFavorited id.
	 * @return If id is valid, return PostUnFavorited object with match id, null otherwise.
	 */
	public PostUnFavorited getPostUnFavoritedByID(int id) {
		PostUnFavorited postUnFav = null;
		// Add code here
		return postUnFav;
	}
	/**
	 * Get list of Referral objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Referral objects.
	 */
	public List<Referral> getListReferral(int numberOfRow) {
		List<Referral> listRef = null;
		// Add code here
		return listRef;
	}
	/**
	 * Get Referral object from database by ID.
	 * @param id Referral id.
	 * @return If id is valid, return Referral object with match id, null otherwise.
	 */
	public Referral getReferralByID(int id) {
		Referral refer = null;
		// Add code here
		return refer;
	}
	/**
	 * Get list of Static objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Static objects.
	 */
	public List<Static> getListStatic(int numberOfRow) {
		List<Static> listStatic = null;
		// Add code here
		return listStatic;
	}
	/**
	 * Get Static object from database by ID.
	 * @param id Static id.
	 * @return If id is valid, return Static object with match id, null otherwise.
	 */
	public Static getStaticByID(int id) {
		Static staticObj = null;
		// Add code here
		return staticObj;
	}
}
