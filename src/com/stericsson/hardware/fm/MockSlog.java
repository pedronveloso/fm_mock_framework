package com.stericsson.hardware.fm;

import android.util.Log;

/**
 * User: Pedro Veloso
 * Date: 1/20/13
 * Time: 3:25 AM
 */
public class MockSlog {

    public static void e(String tag, String reason, Exception ex) {
        Log.e(tag, reason + ". E.: " + ex.getMessage());
    }
}
