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
import android.support.v4.view.ViewPager;
import android.support.v4.view.PagerAdapter;
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
public class ImageViewFragment extends Fragment {
	//private
	ImageView imageView;

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
		
		ViewPager viewPager = (ViewPager) myFragmentView.findViewById(R.id.view_pager);
	    
		
		switch (type) {
		case 1:
			ImagePagerAdapter adapter = new ImagePagerAdapter();
		    adapter.mImages = new ArrayList<String>();
		    adapter.mImages.add("http://anhdep.pro/wp-content/uploads/2014/07/nhung-hinh-nen-may-tinh-dep-nhat-va-da-dang-5.jpg");
		    adapter.mImages.add("http://3.bp.blogspot.com/-w0t0DqmViug/UJnCRoYQyqI/AAAAAAAAA4s/jS1-h6-hZK8/s1600/anh+hoa+dep13.jpg");
		    adapter.mImages.add("http://anhdep.pro/wp-content/uploads/2014/07/nhung-hinh-nen-may-tinh-dep-nhat-va-da-dang-4.jpg");
		    adapter.mImages.add("http://img.tamtay.vn/files/2008/07/14/hongphu2290/photos/200754/487be7c8_487b77b5_anh2071.jpg");
		    
			 viewPager.setAdapter(adapter);
			 String text = "alo :) :) :)";
			 TextView tv = (TextView) myFragmentView.findViewById(R.id.textView2);
			 tv.setText(image_smiley.getSmiledText(getActivity().getApplicationContext(),text ));
			 
			break;
		case 2:
			ImagePagerAdapter adapter1 = new ImagePagerAdapter();
		    adapter1.mImages = new ArrayList<String>();
		    adapter1.mImages.add("http://data.sinhvienit.net/2010/T11/img/SinhVienIT.NET---1234.gif");
		    adapter1.mImages.add("http://img.el-wlid.com/imgcache/96270.gif");
		    adapter1.mImages.add("http://www.lhsvn.com.vn/uploads/userFiles/Flowering3.gif");
		    adapter1.mImages.add("http://canhdongtruyengiao.net/TimhieuDao/giaolynamductin2012/giaolyductin9/hoahongno.gif");
			 viewPager.setAdapter(adapter1);
		      
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
		return myFragmentView;
	}
	private class ImagePagerAdapter extends PagerAdapter {
	    private List<String> mImages;

	    @Override
	    public int getCount() {
	      return mImages.size();
	    }

	    @Override
	    public boolean isViewFromObject(View view, Object object) {
	      return view == ((ImageView) object);
	    }

	    @Override
	    public Object instantiateItem(ViewGroup container, int position) {
	      Context context = getActivity();
	      imageView = new ImageView(context);
	      int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
	      imageView.setPadding(padding, padding, padding, padding);
	      Ion.with(imageView).load(mImages.get(position));
	      ((ViewPager) container).addView(imageView, 0);
	      return imageView;
	    }

	    @Override
	    public void destroyItem(ViewGroup container, int position, Object object) {
	      ((ViewPager) container).removeView((ImageView) object);
	    }
	  }
	}

