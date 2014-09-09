package com.alavui.ui;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class VideoViewActivity extends Activity {
	String videoURL = "http://www.youtube.com/embed/-22QTvJF81M";
	WebView mWebView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video_view);
		initwebView();
	}

	private void initwebView() {
		mWebView = (WebView) findViewById(R.id.webView);

		if (Build.VERSION.SDK_INT < 8) {
			mWebView.getSettings().setPluginsEnabled(true);
		} else {
			mWebView.getSettings().setPluginState(PluginState.ON);
		}
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.setWebChromeClient(new MyChromeClient(){
			@Override
		    public void onShowCustomView(View view, CustomViewCallback callback) {
		        super.onShowCustomView(view, callback);
		        if (view instanceof FrameLayout) {
		            FrameLayout frame = (FrameLayout) view;
		            if (frame.getFocusedChild() instanceof VideoView) {
		                VideoView video = (VideoView) frame.getFocusedChild();
		                frame.removeView(video);
		                setContentView(video);
		                //video.setOnCompletionListener(this);
		               // video.setOnErrorListener(this);
		                video.start();
		            }
		        }
		    }
		});
		mWebView.loadUrl(videoURL);
	}

	class MyChromeClient extends WebChromeClient {

		@Override
		public void onShowCustomView(View view, CustomViewCallback callback) {
			/** Remove super function, it stucks to play youtube video if you click fullscreen icon **/
			// super.onShowCustomView(view, callback);
			Intent intent = new Intent(VideoViewActivity.this, video.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			intent.putExtra("video", videoURL);
			startActivity(intent);

		}

	}

}
