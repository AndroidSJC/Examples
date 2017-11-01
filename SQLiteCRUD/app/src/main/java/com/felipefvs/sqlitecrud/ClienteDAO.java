package com.felipefvs.sqlitecrud;

import android.content.ContentValues;
import android.content.Context;

/**
 * Created by FELIPESIQUEIRAB20588 on 01/11/2017.
 */

public class ClienteDAO {

    private final String TABLE_CLIENTES = "Clientes";
    private DbGateway gw;

    public ClienteDAO(Context context) {
        gw = DbGateway.getInstance(context);
    }

    public boolean salvar(String nome, String sexo, String uf, boolean vip)
    {
        ContentValues cv = new ContentValues();
        cv.put("Nome", nome);
        cv.put("Sexo", sexo);
        cv.put("UF", uf);
        cv.put("Vip", vip ? 1 : 0);

        return gw.getDatabase().insert(TABLE_CLIENTES, null, cv) > 0;
    }
}
