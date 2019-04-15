package com.bbharati.simplemathlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void shortDuration(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void longDuration(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show();
    }
}
