package com.conanlm.helloworld.util;

import android.content.Context;
import android.widget.Toast;

/**
 * 作者  conanlm
 * 时间  2018/8/22 12:19
 */
public class ToastUtil {
    public static Toast mToast;
    public static void showMsg(Context context, String msg){
        if(mToast==null){
            mToast=Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}
