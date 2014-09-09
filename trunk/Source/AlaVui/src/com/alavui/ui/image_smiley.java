package com.alavui.ui;

import java.util.HashMap;
import java.util.Map.Entry;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

public class image_smiley {
	private static final HashMap<String, Integer> emoticons = new HashMap<String, Integer>();
	static {
	  emoticons.put(":)", R.drawable.ic_launcher);}
	
	public static Spannable getSmiledText(Context context, String text) {
	      SpannableStringBuilder builder = new SpannableStringBuilder(text);
	      int index;
	      for (index = 0; index < builder.length(); index++) {
	        for (Entry<String, Integer> entry : emoticons.entrySet()) {
	          int length = entry.getKey().length();
	          if (index + length > builder.length())
	            continue;
	          if (builder.subSequence(index, index + length).toString().equals(entry.getKey())) {
	            builder.setSpan(new ImageSpan(context, entry.getValue()), index, index + length,
	                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
	            index += length - 1;
	            break;
	          }
	        }
	      }
	      return builder;
	    }

}
