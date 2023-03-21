package com.myapplication.gatologin.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Instance extends SQLiteOpenHelper {

    private static final String DB_NAME = "app.db";
    private static final int VERSION = 1;

    public Instance(@Nullable Context context) {
        super(context, DB_NAME , null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL(Schema.CREATE_USERINFO_TBL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sql, int i, int i1) {
        sql.execSQL(Schema.DROP_USERINFO_TBL);
    }
}
