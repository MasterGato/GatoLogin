package com.myapplication.gatologin.database;

import com.myapplication.gatologin.model.PersonalInformation;

public class Schema {

    public static final String DROP_USERINFO_TBL = "DROP TABLE IF EXISTS " + Table.TBL_USERINFO;
    public static final String CREATE_USERINFO_TBL = "CREATE TABLE " + Table.TBL_USERINFO + "(" +
            "USER_ID INTEGER PRIMARY KEY," +
            PersonalInformation.clm_firstname +" text," +
            PersonalInformation.clm_middlename + " text," +
            PersonalInformation.clm_lastname + " text," +
            PersonalInformation.clm_birthdate+" text," +
            PersonalInformation.clm_username +" text," +
            PersonalInformation.clm_password+ " text)";
}
