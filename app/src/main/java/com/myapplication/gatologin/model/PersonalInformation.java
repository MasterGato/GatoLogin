package com.myapplication.gatologin.model;

import java.util.Date;

public class PersonalInformation {

    public static String clm_firstname = "CLM_FIRSTNAME";
    public static String clm_lastname = "CLM_LASTNAME";
    public static String clm_middlename = "CLM_MIDDLENAME";
    public static String clm_birthdate = "CLM_BIRTHDATE";
    public static String clm_username = "CLM_USERNAME";
    public static String clm_password = "CLM_PASSWORD";

    private String str_fname;
    private String str_lname;
    private String str_mname;
    private String dt_birthdate;
    private String str_username;
    private String str_password;
    private String str_retypepassword;

    public PersonalInformation() {
    }

    public PersonalInformation(String str_fname, String str_lname, String str_mname, String dt_birthdate, String str_username, String str_password, String str_retypepassword) {
        this.str_fname = str_fname;
        this.str_lname = str_lname;
        this.str_mname = str_mname;
        this.dt_birthdate = dt_birthdate;
        this.str_username = str_username;
        this.str_password = str_password;
        this.str_retypepassword = str_retypepassword;
    }

    public String getStr_fname() {
        return str_fname;
    }

    public String getStr_lname() {
        return str_lname;
    }

    public String getStr_mname() {
        return str_mname;
    }

    public String getDt_birthdate() {
        return dt_birthdate;
    }

    public String getStr_username() {
        return str_username;
    }

    public String getStr_password() {
        return str_password;
    }

    public String getStr_retypepassword() {
        return str_retypepassword;
    }

    public void setStr_fname(String str_fname) {
        this.str_fname = str_fname;
    }

    public void setStr_lname(String str_lname) {
        this.str_lname = str_lname;
    }

    public void setStr_mname(String str_mname) {
        this.str_mname = str_mname;
    }

    public void setDt_birthdate(String dt_birthdate) {
        this.dt_birthdate = dt_birthdate;
    }

    public void setStr_username(String str_username) {
        this.str_username = str_username;
    }

    public void setStr_password(String str_password) {
        this.str_password = str_password;
    }

    public void setStr_retypepassword(String str_retypepassword) {
        this.str_retypepassword = str_retypepassword;
    }
}
