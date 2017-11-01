package com.felipefvs.sqlitecrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by FELIPESIQUEIRAB20588 on 01/11/2017.
 */

public class DbGateway {

    private static DbGateway gw;
    private SQLiteDatabase db;

    private DbGateway(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public static DbGateway getInstance(Context context)
    {
        if(gw == null)
            gw = new DbGateway(context);
        return gw;
    }

    public SQLiteDatabase getDatabase(){
        return this.db;
    }
}
