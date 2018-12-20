package com.demo.ycwang.ycwangdemo;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;

import com.demo.ycwang.ycwangdemo.animation.AnimationActivity;
import com.demo.ycwang.ycwangdemo.edittext.SpaceEditTextActivity;
import com.demo.ycwang.ycwangdemo.imgcrop.ImageCropActivity;
import com.demo.ycwang.ycwangdemo.keyboard.KeyBoardActivity;
import com.demo.ycwang.ycwangdemo.recylerview.RecyclerViewActivity;
import com.demo.ycwang.ycwangdemo.slidetab.SlideTabActivity;
import com.demo.ycwang.ycwangdemo.slidingtray.SlidingTrayActivity;
import com.demo.ycwang.ycwangdemo.tab.TabActivity;
import com.demo.ycwang.ycwangdemo.viewdraghelper.ViewDragHelperActivity;

// Intent.FLAG_ACTIVITY_NEW_TASK 启动的Activity都将在每个新的Task中 ，一般从Service中启动Activity用此标志
// Intent.FLAG_ACTIVITY_SINGLE_TOP 与指定 android:launchMode="singleTop" 一样
// Intent.FLAG_ACTIVITY_NO_HISTORY 所启动的Activity不会保留在栈中

/**
 * @Author: ycwang
 * @Date: 2018-12-18 11:20
 */
public class LaunchUtil {

    public static void launchSpaceEditText(Context context) {
        Intent intent = new Intent(context, SpaceEditTextActivity.class);
        context.startActivity(intent);
    }

    public static void launchRecyclerViewActivity(Context context) {
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        context.startActivity(intent);
    }

    public static void launchSlidingtrayActivity(Context context) {
        Intent intent = new Intent(context, SlidingTrayActivity.class);
        context.startActivity(intent);
    }

    public static void launchTabActivity(Context context) {
        Intent intent = new Intent(context, TabActivity.class);
        context.startActivity(intent);
    }

    public static void launchViewDragHelperActivity(Context context) {
        Intent intent = new Intent(context, ViewDragHelperActivity.class);
        context.startActivity(intent);
    }

    public static void launchSlideTab(Context context) {
        Intent intent = new Intent(context, SlideTabActivity.class);
        context.startActivity(intent);
    }

    public static void launchCropImage(Context context) {
        Intent intent = new Intent(context, ImageCropActivity.class);
        context.startActivity(intent);
    }

    public static void launchKeyBoard(Context context) {
        Intent intent = new Intent(context, KeyBoardActivity.class);
        context.startActivity(intent);
    }

    public static void launchAnimation(Context context) {
        Intent intent = new Intent(context, AnimationActivity.class);
        context.startActivity(intent);
    }


}
