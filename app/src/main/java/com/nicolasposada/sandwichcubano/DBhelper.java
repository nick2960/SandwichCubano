package com.nicolasposada.sandwichcubano;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Nicolas on 10/06/2015.
 */
public class DBhelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "cubano.sqlite";
    private static final int DB_SCHEME_VERSION = 1;

    public DBhelper (Context context){
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DataBaseManager.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
