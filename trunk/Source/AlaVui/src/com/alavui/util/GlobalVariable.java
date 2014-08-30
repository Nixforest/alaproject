/*
* GlobalVariable
* 
* Version information
*
* Date
* 12-Aug-2014
* Copyright notice
* 
* Modification Logs:
* DATE    AUTHOR DESCRIPTION
*  --------------------------------------------------------
*  12-Aug-2014	NguyenPT	Init coding
*/
package com.alavui.util;

/**
 * Global variables.
 * @author NguyenPT
 * 
 */
public final class GlobalVariable {
	/**
	 * Constructor.
	 */
	private GlobalVariable() {
    }
	/**
	 * Project name.
	 */
	public static final String PROJECT_NAME 			= "Ala Vui";
	/**
	 * Menu New title.
	 */
	public static final String MENU_TITLE_NEW 			= "Mới";
	/**
	 * Menu Hot title.
	 */
	public static final String MENU_TITLE_HOT			= "HOT";
	/**
	 * Menu Not Seen title.
	 */
	public static final String MENU_TITLE_NOTSEEN		= "Chưa xem";
	/**
	 * Menu Old title.
	 */
	public static final String MENU_TITLE_OLD			= "Cũ";
	/**
	 * Menu Vote title.
	 */
	public static final String MENU_TITLE_VOTE			= "Bình chọn";
	/**
	 * Menu Upload title.
	 */
	public static final String MENU_TITLE_UPLOAD		= "Đăng ảnh";
	/**
	 * Menu Video title.
	 */
	public static final String MENU_TITLE_VIDEO			= "Video";
	/**
	 * Menu Log in title.
	 */
	public static final String MENU_TITLE_LOGIN			= "Đăng nhập";
	/**
	 * Menu Option title.
	 */
	public static final String MENU_TITLE_OPTION		= "Tùy chọn";
	/**
	 * Menu Application title.
	 */
	public static final String MENU_TITLE_APPLICATION	= "Ứng dụng hay";
	/**
	 * String array to remove sign in Vietnamese.
	 */
	 public static final String[] VIETNAMESE_SIGNS = new String[]{"aAeEoOuUiIdDyY", "áàạảãâấầậẩẫăắằặẳẵ", "ÁÀẠẢÃÂẤẦẬẨẪĂẮẰẶẲẴ",
         "éèẹẻẽêếềệểễ", "ÉÈẸẺẼÊẾỀỆỂỄ", "óòọỏõôốồộổỗơớờợởỡ", "ÓÒỌỎÕÔỐỒỘỔỖƠỚỜỢỞỠ", "úùụủũưứừựửữ", "ÚÙỤỦŨƯỨỪỰỬỮ",
         "íìịỉĩ", "ÍÌỊỈĨ", "đ", "Đ", "ýỳỵỷỹ", "ÝỲỴỶỸ"};
	 /**
	  * Constants String success.
	  */
	 public static final String SUCCESS_STRING				= "success";
	 /**
	  * Constants Fail.
	  */
	 public static final int FAIL_VALUE						= 0;
	 /**
	  * Constant success.
	  */
	 public static final int SUCCESS_VALUE					= 1;
	 /**
	  * Method POST.
	  */
	 public static final String POST_METHOD					= "POST";
	 /**
	  * Method GET.
	  */
	 public static final String GET_METHOD					= "GET";
	 /**
	  * Encode UTF-8.
	  */
	 public static final String	UTF8_ENCODE					= "utf-8";
	 /**
	  * Charset iso-8859-1.
	  */
	 public static final String	CHARSET_ISO88591			= "iso-8859-1";
	 /**
	  * Message "Buffer Error".
	  */
	 public static final String MSG_BUFFER_ERR				= "Buffer Error";
	 /**
	  * Message "Error converting result ".
	  */
	 public static final String MSG_ERR_CONV_RESLT			= "Error converting result ";
	 /**
	  * Message "JSON Parser".
	  */
	 public static final String MSG_JSON_PARSER				= "JSON Parser";
	 /**
	  * Message "Error parsing data ".
	  */
	 public static final String MSG_ERR_PARSING_DATA		= "Error parsing data ";
	 /**
	  * String link get all members.
	  */
	 public static final String URL_MEMBER_ALL				= "";
	 /**
	  * String link get member by Id.
	  */
	 public static final String URL_MEMBER_DETAIL			= "";
	 /**
	  * String link get all posts.
	  */
	 public static final String URL_POST_ALL				= "";
	 /**
	  * String link get post by Id.
	  */
	 public static final String URL_POST_DETAIL				= "";
	 /**
	  * String link get post favorited all.
	  */
	 public static final String URL_POST_FAVORITED_ALL		= "";
	 /**
	  * String link get post favorited by Id.
	  */
	 public static final String URL_POST_FAVORITED_DETAIL	= "";
	 /**
	  * String link get post report all.
	  */
	 public static final String URL_POST_REPORT_ALL			= "";
	 /**
	  * String link get post report detail by Id.
	  */
	 public static final String URL_POST_REPORT_DETAIL		= "";
	 /**
	  * String link get post unfavorited all.
	  */
	 public static final String URL_POST_UNFAVORITED_ALL	= "";
	 /**
	  * String link get post unfavorited by Id.
	  */
	 public static final String URL_POST_UNFAVORITE_DETAIL	= "";
	 /**
	  * String date format.
	  */
	 public static final String DATE_FORMAT					= "dd/MMM/yyyy";
	 /**
	  * Table members and fields.
	  */
	 public static final String TABLE_MEMBERS				= "members"; 
	 public static final String USER_ID						= "USERID";
	 public static final String EMAIL						= "email";
	 public static final String USER_NAME					= "username";
	 public static final String PASSWORD					= "passwrord";
	 public static final String FULLNAME					= "fullname";
	 
	 /**
	  * Table posts and fields.
	  */
	 public static final String TABLE_POSTS					= "posts";
	 public static final String POST_ID						= "PID";
	 public static final String POST_STORY					= "story";
	 public static final String POST_PIC					= "pic";
	 public static final String POST_YOUTUBE_KEY			= "youtube_key";
	 public static final String POST_URL					= "url";
	 public static final String POST_TIME_ADDED				= "time_added";
	 public static final String POST_DATE_ADDED				= "date_added";
	 public static final String POST_FAVORITE_CLICKS		= "favclicks";
	 public static final String POST_UNFAVORITE_CLICKS		= "unfavclicks";
	 public static final String POST_VIEW					= "view";
	 
	 /**
	  * Table Post Favorited and fields.
	  */
	 public static final String TABLE_POST_FAVORITED		= "posts_favorited";
	 public static final String FAVORITED_ID				= "FID";
}
