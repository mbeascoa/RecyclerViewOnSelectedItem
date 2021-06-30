package com.example.recyclerviewonselecteditem;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Clientes> listaClientes;
    int posicionseleccionada=0;


    //int posicionseleccionada=0;
    public Adapter(List<Clientes> ListaCliente) {
        this.listaClientes = ListaCliente;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String nombre = listaClientes.get(position).getNombre();
        holder.txtnombre.setText(nombre);

        holder.txtnombre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                System.out.println(holder.txtnombre.getText().toString());
                posicionseleccionada=position;
                notifyDataSetChanged();  //este metodo está a la escucha de los cambios
                //Notificamos cambios para que el contenedor se entere y refresque los datos
            }
        });

        if(posicionseleccionada==position){
            holder.txtnombre.setTextColor(Color.RED);

        }
        else{
            holder.txtnombre.setTextColor(Color.CYAN);
        }

    }

    @Override
    public int getItemCount() {
        return listaClientes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnombre;
        public ViewHolder(View v) {
            super(v);
            txtnombre = (TextView) v.findViewById(R.id.txtNombre);
        }
    }

}






