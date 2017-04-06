package com.example.ida.trysqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ida on 2017-04-06.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "customers.db";
    public static final String TABLE_NAME = "customers_table";
    public static final String COLUMN1 = "FirstName";
    public static final String COLUMN2 = "LastName";
    public static final String COLUMN3 = "Address";
    public static final String COLUMN4 = "Telephone";
    public static final String COLUMN_ID = "ID";
    public static final String SQL_STRING = "create table" + TABLE_NAME +
            "(" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN1 + " TEXT, " + COLUMN2 + "TEXT, " + COLUMN3 + "TEXT, " + COLUMN4 + "TEXT)";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_STRING);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(Customer customer){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN1, customer.getFirstName() );
        contentValues.put(COLUMN2, customer.getLastName() );
        contentValues.put(COLUMN3, customer.getAddress() );
        contentValues.put(COLUMN4, customer.getTele() );

        long result = db.insert(TABLE_NAME, null, contentValues);

        if(result < 0){
            return false;
        }else{
            return true;
        }
    }
}
