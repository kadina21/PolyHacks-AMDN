package com.example.hackathon;


import android.content.ContentValues;
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


    // Variables for CLIENTS_TABLE
    public static final String COLUMN_FIRST_NAME = "FIRST_NAME";
    public static final String COLUMN_LAST_NAME = "LAST_NAME";
    public static final String COLUMN_PHONE_NUMBER = "PHONE_NUMBER";
    public static final String COLUMN_PASSWORD = "PASSWORD";
    public static final String COLUMN_TRUST_PHONE_NUMBER = "TRUST_PHONE_NUMBER";
    public static final String COLUMN_TRUST_NAME = "TRUST_NAME";
    public static final String COLUMN_TRUST_RELATIONSHIP = "TRUST_RELATIONSHIP";

    // Variables for CALLS_TABLE
    public static final String COLUMN_SCAMMER_PHONE_NUMBER = "SCAMMER_" + COLUMN_PHONE_NUMBER;
    public static final String COLUMN_CALL_DATE = "CALL_DATE";
    public static final String COLUMN_SMS_DATE = "SMS_DATE";
    public static final String COLUMN_ISSCAMMER = "ISSCAMMER";
    public static final String COLUMN_CALLING_PERSON_NUMBER = "CALLING_PERSON_NUMBER";
    public static final String COLUMN_SENDING_PERSON_NUMBER = "SENDING_PERSON_NUMBER";
    public static final String COLUMN_CONTENT = "CONTENT";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String scammers = " CREATE TABLE " + SCAMMERS_TABLE + " (" + COLUMN_SCAMMER_PHONE_NUMBER + " VARCHAR(20))";
        String clients = " CREATE TABLE " + CLIENTS_TABLE + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_FIRST_NAME + " TEXT, " + COLUMN_LAST_NAME + " TEXT, " + COLUMN_PHONE_NUMBER + " CHAR(20), " + COLUMN_PASSWORD + " TEXT, " + COLUMN_TRUST_PHONE_NUMBER + " CHAR(20), " + COLUMN_TRUST_NAME + " TEXT, " + COLUMN_TRUST_RELATIONSHIP + " TEXT )";
        String calls = " CREATE TABLE " + CALLS_TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_CALL_DATE + " TEXT ," + COLUMN_ISSCAMMER + " BOOLEAN, " + COLUMN_CALLING_PERSON_NUMBER + " VARCHAR(20)) ";
        String sms = " CREATE TABLE " + SMS_TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_SMS_DATE + " TEXT,  " + COLUMN_ISSCAMMER + " BOOLEAN, " + COLUMN_SENDING_PERSON_NUMBER + " VARCHAR(20), " + COLUMN_CONTENT + " TEXT ) ";

        db.execSQL(scammers);
        db.execSQL(clients);
        db.execSQL(calls);
        db.execSQL(sms);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    // Scammers: mettre à jour db de scammeurs
    public boolean addScammer(ScammerModel scammerModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_SCAMMER_PHONE_NUMBER, scammerModel.getPhoneNumber());
        long insert = db.insert(SCAMMERS_TABLE, null, cv);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }

    // Clients: mettre a jour db lors de l'ajout d'un compte
    // COLUMN_TRUST_PHONE_NUMBER + " CHAR(20), " + COLUMN_TRUST_NAME + " TEXT, " + COLUMN_TRUST_RELATIONSHIP
    public boolean signup (SignupModel signupModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_FIRST_NAME, signupModel.getFirstName());
        cv.put(COLUMN_LAST_NAME, signupModel.getLastName());
        cv.put(COLUMN_PHONE_NUMBER, signupModel.getPhoneNumber());
        cv.put(COLUMN_PASSWORD, signupModel.getPassword());

        cv.put(COLUMN_TRUST_PHONE_NUMBER, signupModel.getTrustNumber());
        cv.put(COLUMN_TRUST_NAME, signupModel.getTrustName());
        cv.put(COLUMN_TRUST_RELATIONSHIP, signupModel.getTrustRelationship());


        long insert = db.insert(CLIENTS_TABLE, null, cv);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }
    // Mettre à jour la liste des appels reçus
    public boolean addCall(CallsModel callsModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_CALL_DATE, callsModel.getDate());
        cv.put(COLUMN_ISSCAMMER, callsModel.isScammer());
        cv.put(COLUMN_CALLING_PERSON_NUMBER, callsModel.getCallingPersonNumber());

        long insert = db.insert(CALLS_TABLE, null, cv);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
    // Mettre à jour la liste des SMS reçus
    public boolean addSms(SmsModel smsModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_SMS_DATE, smsModel.getDate());
        cv.put(COLUMN_ISSCAMMER, smsModel.isScammer());
        cv.put(COLUMN_SENDING_PERSON_NUMBER, smsModel.getSendingPersonNumber());

        long insert = db.insert(SMS_TABLE, null, cv);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }



}


