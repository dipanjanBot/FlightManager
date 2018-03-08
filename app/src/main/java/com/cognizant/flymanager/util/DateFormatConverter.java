package com.cognizant.flymanager.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dipanjan on 21-11-2017.
 */

public class DateFormatConverter {

    public static String convertDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(date);
    }
}
