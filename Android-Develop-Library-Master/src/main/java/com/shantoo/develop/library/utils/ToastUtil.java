package com.shantoo.develop.library.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shantoo.develop.library.R;

public class ToastUtil {

	/**
	 * show a short short with message
	 * @param context context
	 * @param message toast message
	 * */
	public static void showShort(Context context,String message){
		Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
	}

	/**
	 * show a short toast with message
	 * @param context context
	 * @param message toast message
	 * */
	public static void showLong(Context context,String message){
		Toast.makeText(context,message,Toast.LENGTH_LONG).show();
	}
}
