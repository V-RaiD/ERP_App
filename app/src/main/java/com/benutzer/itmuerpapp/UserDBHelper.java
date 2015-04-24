package com.benutzer.itmuerpapp;

/**
 * Created by amitesh on 10/4/15.
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class UserDBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "erpProject.db";
    private SQLiteDatabase myDataBase;
    private final Context myContext;
    private static final String TABLE_USER = "userDetails";

    private static final String COLUMN_USERNAME = "_username";
    private static final String COLUMN_PASSWORD = "_password";

    public DataBaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
        this.myContext = context;
    }



    /*@Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }*/
}
