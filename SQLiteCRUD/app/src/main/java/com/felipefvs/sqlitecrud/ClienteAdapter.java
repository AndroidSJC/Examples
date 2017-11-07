package com.felipefvs.sqlitecrud;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by FELIPESIQUEIRAB20588 on 07/11/2017.
 */

public class ClienteAdapter extends RecyclerView.Adapter<ClienteHolder> {

    private final List<Cliente> clientes;

    public ClienteAdapter(List<Cliente> clientes){
        this.clientes = clientes;
    }

    @Override
    public ClienteHolder onCreateViewHolder(ViewGroup parent, int viewType)  {
        return new ClienteHolder(LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_lista, parent, false));
    }

    @Override
    public void onBindViewHolder(ClienteHolder holder, int position) {

        final Cliente cliente = clientes.get(position);

        holder.nomeCliente.setText(cliente.getNome());

        holder.btnEditar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = getActivity(v);
                Intent intent = activity.getIntent();
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.putExtra("cliente", cliente);
                activity.finish();
                activity.startActivity(intent);
            }
        });
    }

    public void atualizarCliente(Cliente cliente){
        clientes.set(clientes.indexOf(cliente), cliente);
        notifyItemChanged(clientes.indexOf(cliente));
    }

    @Override
    public int getItemCount() {
        return clientes != null ? clientes.size() : 0;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        notifyItemInserted(getItemCount());
    }

    private Activity getActivity(View view) {
        Context context = view.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }
}
