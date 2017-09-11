package com.example.usuario.basededatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class DataEntryDAO {
    public String TAG = Constants.TAG;
    private Context context;
    private DataBaseHandler sDbHandler;
    private SQLiteDatabase sDatabase;

    public DataEntryDAO(Context context){
        this.context = context;
        sDbHandler = new DataBaseHandler(context);

        open();
    }
    private void open (){
        sDatabase = sDbHandler.getWriteDatabase();
    }

    public long addDataEntry(DataEntry entry){
        ContentValues Values = new ContentValues();
        Values.put(DataBaseHandler.KEY_CAMPO1,entry.campo1);
        Values.put(DataBaseHandler.KEY_CAMPO2,entry.campo2);

        long index = sDatabase.insert(DataBaseHandler.TABLE,)
    }
}
