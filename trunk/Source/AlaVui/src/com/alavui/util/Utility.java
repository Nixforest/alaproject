/*
* Utility
* A class provide some method for utility.
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
 * A class provide some method for utility.
 * @author NguyenPT
 *
 */
public final class Utility {
    
	/**
	 * Constructor.
	 */
	protected Utility() {
	}
	/**
     * Method remove sign in Vietnamese string.
     * @param text String to remove sign
     * @return String after remove sign
     */
    public static String removeSign4VietNameseString(String text) {
        for (int i = 1; i < GlobalVariable.VIETNAMESE_SIGNS.length; i++) {
            for (int j = 0; j < GlobalVariable.VIETNAMESE_SIGNS[i].length(); j++) {
                text = text.replace(GlobalVariable.VIETNAMESE_SIGNS[i].charAt(j),
                		GlobalVariable.VIETNAMESE_SIGNS[0].charAt(i - 1));
            }
        }
        return text;
    }
    
    /***
     * Get JSON from URL by making HTTP POST or GET method
     * @param url: Link URL
     * @param method: Method POST or GET
     * @param params: List param
     * @return
     */
    public static JSONObject makeHttpRequest(String url, String method,
            List<NameValuePair> params) {
    	InputStream is = null;
        JSONObject jObj = null;
        String json = "";
        
        /* Making HTTP request */
        try {
            /* check for request method */
            if(method == "POST"){
                // request method is POST
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(url);
                httpPost.setEntity(new UrlEncodedFormEntity(params));

                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                is = httpEntity.getContent();
            }else if(method == "GET"){
                // request method is GET
                DefaultHttpClient httpClient = new DefaultHttpClient();
                String paramString = URLEncodedUtils.format(params, "utf-8");
                url += "?" + paramString;
                HttpGet httpGet = new HttpGet(url);

                HttpResponse httpResponse = httpClient.execute(httpGet);
                HttpEntity httpEntity = httpResponse.getEntity();
                is = httpEntity.getContent();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            json = sb.toString();
        } catch (Exception e) {
            Log.e("Buffer Error", "Error converting result " + e.toString());
        }

        // try parse the string to a JSON object
        try {
            jObj = new JSONObject(json);
        } catch (JSONException e) {
            Log.e("JSON Parser", "Error parsing data " + e.toString());
        }

        // return JSON String
        return jObj;
    }   
}
