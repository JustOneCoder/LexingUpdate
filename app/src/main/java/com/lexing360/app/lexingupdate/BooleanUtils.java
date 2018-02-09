package com.lexing360.app.lexingupdate;

import android.text.TextUtils;

/**
 * Created by fenglingfeng on 2018/2/8.
 */

public class BooleanUtils {

    public static String convertToString(Boolean b) {
        if (b) {
            return "true";
        }
        return "false";
    }

    public static boolean convertToBoolean(String s) {
        boolean b = false;
        if (TextUtils.equals(s,"true")) {
             b = true;
        }else if (TextUtils.equals(s,"fasle")){
            b = false;
        }else{

        }
        return b;
    }
}
