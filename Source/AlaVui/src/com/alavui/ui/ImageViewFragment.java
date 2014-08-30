package com.alavui.ui;

import java.util.List;

import com.alavui.controller.MainController;
import com.alavui.model.Post;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment for image view
 * @author TamNT
 *
 */
public class ImageViewFragment extends Fragment {

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
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View myFragmentView = new View(container.getContext());
		//List<Post> listPost = MainController.INSTANCE.getData(Post.class, 10);
		myFragmentView = inflater.inflate(R.layout.imageview_layout, container,
				false);
		TextView myText = (TextView) myFragmentView.findViewById(R.id.textView1);
		switch (type) {
		case 0:
			myText.setText("NEW");
			break;
		case 1:
			myText.setText("UNREAD");
			break;
		case 2:
			myText.setText("HOT");
			break;
		case 3:
			myText.setText("OLD");
			break;
		case 4:
			myText.setText("VOTE");
			break;
		default:
			break;
		}
		return myFragmentView;
	}

}
