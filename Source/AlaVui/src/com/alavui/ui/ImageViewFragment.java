package com.alavui.ui;

import java.util.ArrayList;
import java.util.List;

import com.alavui.controller.MainController;
import com.alavui.model.Post;
import com.koushikdutta.ion.Ion;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.VideoView;

/**
 * Fragment for image view
 * @author TamNT
 *
 */
public class ImageViewFragment extends Fragment implements OnTouchListener {

	/**
	 * type of image view
	 */
	int type;

	/**
	 * Constructor
	 */
	public ImageViewFragment() {

	}

	/**
	 * Constructor
	 * @param type type of image view
	 */
	public ImageViewFragment(int type) {
		this.type = type;
	}

	/**
	 * Create view
	 */
	List<Integer> imgresource = new ArrayList<Integer>();
	ImageView img = null;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View myFragmentView = new View(container.getContext());
		//List<Post> listPost = MainController.INSTANCE.getData(Post.class, 10);
		myFragmentView = inflater.inflate(R.layout.imageview_layout, container,
				false);
		//TextView myText = (TextView) myFragmentView.findViewById(R.id.textView1);
		//add list image
		img = (ImageView) myFragmentView.findViewById(R.id.image1);
		imgresource.add(R.drawable.ic_drawer_hot);
		imgresource.add(R.drawable.ic_drawer_new);
		imgresource.add(R.drawable.anh1);
		//add video
		
		
		switch (type) {
		case 0:
			 img.setImageResource(imgresource.get(2));
			 String text = "alo :) :) :)";

			 TextView tv = (TextView) myFragmentView.findViewById(R.id.textView2);
			 tv.setText(image_smiley.getSmiledText(getActivity().getApplicationContext(),text ));
			 
			break;
		case 1:
				//Ion.with(img).load("http://cuoikieuviet.com/sites/default/files/anh-dong3.gif");
				Ion.with(img).load("http://2.bp.blogspot.com/-sZOB_SiLxxs/UWW6sY21oPI/AAAAAAAAV-8/0VZVOXphL9g/s1600/hinhmaulamgiatrang.gif");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			
			break;
		default:
			break;
		}
		img.setOnTouchListener(this);
		return myFragmentView;
	}
	/**
	 * event drop drag image in screen
	 */
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_MOVE:
			switch (type) {
			case 0:
				img.setImageResource(imgresource.get(1));
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;

		default:
			break;
		}
		return true;
	}

}
