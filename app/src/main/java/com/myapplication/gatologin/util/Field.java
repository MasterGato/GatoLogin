package com.myapplication.gatologin.util;

public class Field {


    public static boolean CheckFild(String[] field){
        boolean isField = false;
        for(String str: field){
            if(str.isEmpty()) {
                isField = true;
            }
        }
        return isField;
    }

}
