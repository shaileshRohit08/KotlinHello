package com.kotlinexample.Utils;

import android.util.Log;

/**
 * Created by shailesh.rohit on 02-12-2017.
 */

public class Logger {


    public static String Tag="Logger: ";

    public static void LogE(String message){
        Log.e(Tag,message);
    }

    public static void LogI(String message){
        Log.i(Tag,message);
    }

    public static void LogD(String message){
        Log.d(Tag,message);
    }

    public static void LogV(String message){
        Log.v(Tag,message);
    }
}
