package com.felipefvs.sqlitecrud;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by FELIPESIQUEIRAB20588 on 07/11/2017.
 */

public class ClienteHolder extends RecyclerView.ViewHolder {

    public TextView nomeCliente;
    public ImageButton btnEditar;
    public ImageButton btnExcluir;

    public ClienteHolder(View itemView)
    {
        super(itemView);
        nomeCliente = itemView.findViewById(R.id.nomeCliente);
        btnEditar = itemView.findViewById(R.id.btnEdit);
        btnExcluir = itemView.findViewById(R.id.btnDelete);
    }

}
