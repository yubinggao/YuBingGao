package com.yubinggao;

import android.content.Context;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * ImageView创建工厂
 */
public class ViewFactory {

	/**
	 * 获取ImageView视图的同时加载显示url
	 * 
	 * @param url
	 * @return
	 */
	public static ImageView getImageView(Context context, String url) {
//		ImageView imageView = (ImageView)LayoutInflater.from(context).inflate(
//				R.layout.view_banner, null);
		ImageView imageView =  new ImageView(context);
		ImageLoader.getInstance().displayImage(url, imageView);
		return imageView;
	}
}
