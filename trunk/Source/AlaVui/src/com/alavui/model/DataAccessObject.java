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
*/
package com.alavui.model;

import java.util.List;

/**
 * Data Access object.
 * @author NguyenPT
 *
 */
public enum DataAccessObject {
	/**
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
		List<Member> listMember = null;
		// Add code here
		return listMember;
	}
	/**
	 * Get Member object from database by ID.
	 * @param id Member id.
	 * @return If id is valid, return Member object with match id, null otherwise.
	 */
	public Member getMemberByID(int id) {
		Member member = null;
		// Add code here
		return member;
	}
	/**
	 * Get list of Post objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of Post objects.
	 */
	public List<Post> getListPost(int numberOfRow) {
		List<Post> listPost = null;
		// Add code here
		return listPost;
	}
	/**
	 * Get Post object from database by ID.
	 * @param id Post id.
	 * @return If id is valid, return Post object with match id, null otherwise.
	 */
	public Post getPostByID(int id) {
		Post post = null;
		// Add code here
		return post;
	}
	/**
	 * Get list of PostFavorited objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of PostFavorited objects.
	 */
	public List<PostFavorited> getListPostFavorited(int numberOfRow) {
		List<PostFavorited> listPostFav = null;
		// Add code here
		return listPostFav;
	}
	/**
	 * Get PostFavorited object from database by ID.
	 * @param id PostFavorited id.
	 * @return If id is valid, return PostFavorited object with match id, null otherwise.
	 */
	public PostFavorited getPostFavoritedByID(int id) {
		PostFavorited postFav = null;
		// Add code here
		return postFav;
	}
	/**
	 * Get list of PostReport objects from database.
	 * @param numberOfRow Number of record want to get.
	 * @return List of PostReport objects.
	 */
	public List<PostReport> getListPostReport(int numberOfRow) {
		List<PostReport> listPostReport = null;
		// Add code here
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
