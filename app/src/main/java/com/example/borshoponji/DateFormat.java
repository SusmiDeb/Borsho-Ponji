package com.example.borshoponji;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.Arrays;

public class DateFormat {

//    private static DateFormat singleObject = null;
//
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    public static DateFormat getObject() {
//        if(singleObject == null) {
//            singleObject = new DateFormat();
//        }
//        return singleObject;
//    }

    public String engToBng[][] = new String[365][2];
    public String engToBngLeap[][] = new String[366][2];

    private int m = 0, d = 16;
    private int daysOfMonth[] = {15, 30, 29, 30, 31, 31, 31, 31, 31, 31, 30, 30, 17};
    private int daysOfMonthLeap[] = {15, 30, 30, 30, 31, 31, 31, 31, 31, 31, 30, 30, 17};
    private String numberOfMonth[] = {"Poush", "Magh", "Falgun", "Choitro",
            "Boishakh", "Jyoistho", "Ashar", "Srabon", "Bhadro",
            "Ashshin", "Kartik", "Ogrohayon", "Posush"};

    @RequiresApi(api = Build.VERSION_CODES.O)
    DateFormat(){
        LocalDate ld = LocalDate.now();
        ld = ld.minusDays(ld.getDayOfYear());
        for(int i=0; i<365; i++) {
            ld = ld.plusDays(1);

            if(daysOfMonth[m]>1) {
                d += 1;
                daysOfMonth[m]--;
            }
            else {
                m++;
                d = 1;
            }
            String eng = String.valueOf(ld);    //2022-01-01
            engToBng[i][0] = eng.substring(5, eng.length());  //  01-01
            engToBng[i][1] = numberOfMonth[m]+" "+d;  //poush 17
        }

        ld = LocalDate.now();
        ld = ld.minusDays(ld.getDayOfYear());
        while(!ld.isLeapYear())
            ld = ld.plusYears(1);
        ld = ld.minusYears(1);
        m=0;
        d=16;
        for(int i=0; i<366; i++) {
            ld = ld.plusDays(1);

            if(daysOfMonthLeap[m]>1) {
                d += 1;
                daysOfMonthLeap[m]--;
            }
            else {
                m++;
                d = 1;
            }
            String eng = String.valueOf(ld);
            engToBngLeap[i][0] = eng.substring(5, eng.length());
            engToBngLeap[i][1] = numberOfMonth[m]+" "+d;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDate(LocalDate ld) {
        boolean isLeapYear = ld.isLeapYear();
        String engDate = String.valueOf(ld).substring(5, String.valueOf(ld).length());
        return getDate(engDate, isLeapYear);
    }
    public String getDate(String engDate, boolean isLeapYear) {
        if(isLeapYear)
            for(int i = 0; i < engToBngLeap.length; i++)
                if(engToBngLeap[i][0].equals(engDate))
                    return engToBngLeap[i][1];
        for(int i=0; i<engToBng.length; i++)
            if(engToBng[i][0].equals(engDate))
                return engToBng[i][1];
        return "Invalid date!";
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDayOfBanglaMonth(LocalDate ld){
        String banglaDate = getDate(ld);
        String splited[] = banglaDate.split(" ");    //
        return splited[splited.length - 1];
    }
    public String getDayOfEnglishMonth(LocalDate ld){
        String englishDate = ld.toString();
        String splited[] = englishDate.split("-");    //2022-05-10
        return splited[splited.length - 1];
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public int getBanglaYear(LocalDate ld) {
        String bd = getDate(ld);
        String py[] = {"Poush", "Magh", "Falgun", "Choitro"};
        for(String x: py)
            if(bd.contains(x))
                return ld.getYear() - 594;

        return ld.getYear() - 593;
    }
}