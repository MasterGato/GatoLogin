package com.myapplication.gatologin.database;

import com.myapplication.gatologin.model.PersonalInformation;

public class Query {

    public static final String INSERT_USERDATA = "INSERT INTO "+ Table.TBL_USERINFO +"(" +
            PersonalInformation.clm_username + ", " +
            PersonalInformation.clm_middlename + ", " +
            PersonalInformation.clm_lastname + ", " +
            PersonalInformation.clm_birthdate + ", " +
            PersonalInformation.clm_username + ", " +
            PersonalInformation.clm_password
        +")";
}
