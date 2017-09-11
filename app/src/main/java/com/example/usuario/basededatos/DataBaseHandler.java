package com.example.usuario.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataBaseHandler extends SQLiteOpenHelper {

    public String TAG = Constants.TAG;

    public static final String TABLE = "TheTable";
    public static final String KEY_ID = "id";
    public static final String KEY_CAMPO1 = "campo1" ;
    public static final String KEY_CAMPO2 = "campo2";


    //database version
    private static final int DATABASE_VERSION = 1;

    //database name
    private static final String DATABASE_NAME = "BASE de DATOS";

    public DataBaseHandler(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.d(TAG,"DatabaseHandler constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "onCreateRubricDB ");
        String CREATE_TABLE = "CREATE TABLE " + TABLE + "("
                + KEY_ID + "integer primary key, " + KEY_CAMPO1 + "integer"
                + KEY_CAMPO2 + "integer" + ")";
        if(db.isOpen()){
            db.execSQL(CREATE_TABLE);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.d(TAG, "onUpgradeRubricDB ");
        db.execSQL("DROP TABLE IF EXIST"+ TABLE);

    }
    public SQLiteDatabase getWriteDatabase  (){
        return super.getWritableDatabase();
    }
}
