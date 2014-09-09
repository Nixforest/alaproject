package com.alavui.ui;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;

public class video extends Activity {
	WebView mWebView, fullweb;
	String videoURL = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setTheme(android.R.style.Theme_Light_NoTitleBar_Fullscreen);
		setContentView(R.layout.video_full);
		videoURL = getIntent().getStringExtra("video") + "?fs=1";
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		mWebView = (WebView) findViewById(R.id.fullwebview);

		if (Build.VERSION.SDK_INT < 8) {
			mWebView.getSettings().setPluginsEnabled(true);
		} else {
			mWebView.getSettings().setPluginState(PluginState.ON);
		}
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.setWebChromeClient(new WebChromeClient() {
			@Override
			public void onShowCustomView(View view, CustomViewCallback callback) {
				video.this.finish();
			}
		});
		mWebView.loadUrl(videoURL);
	}
}
