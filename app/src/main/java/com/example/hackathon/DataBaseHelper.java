package com.example.hackathon;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "app_database";
    private static final  String SCAMMERS_TABLE = "scammers";
    private static final  String CLIENTS_TABLE = "clients";
    private static final  String CALLS_TABLE = "calls";
    private static final  String SMS_TABLE = "sms";



    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String scammers = "CREATE TABLE "+ SCAMMERS_TABLE +"(PHONE_NUMBER VARCHAR(20))";
        String clients = "CREATE TABLE " + CLIENTS_TABLE +"(ID INTEGER PRIMARY KEY AUTOINCREMENT, FIRST_NAME TEXT, LAST_NAME TEXT, PHONE_NUMBER CHAR(20)  )";
        String calls = " CREATE TABLE " + CALLS_TABLE +"(ID INTEGER)";
        String sms = " CREATE TABLE " + SMS_TABLE +"(ID INTEGER)";

        db.execSQL(scammers);
        db.execSQL(clients);
        db.execSQL(calls);
        db.execSQL(sms);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
