package com.pluralsight;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(format1.format(now));

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format2.format(now));

        SimpleDateFormat format3 = new SimpleDateFormat("MMMM d, yyyy");
        System.out.println(format3.format(now));

        SimpleDateFormat format4 = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm");
        format4.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(format4.format(now) + "GMT");


        SimpleDateFormat challengeFormat = new SimpleDateFormat("h:mm 'on' dd-MMM-yyyy");
        System.out.println(challengeFormat.format(now));


    }
}
