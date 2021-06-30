package com.example.recyclerviewonselecteditem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView miRecicler;
    private RecyclerView.Adapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     // Buscamos el control para cargar los datos
     miRecicler = (RecyclerView) findViewById(R.id.rv1);

         // Añadimos que el tamaño del RecyclerView no se cambiará.
         // que tiene hijos (items) que tienen anchura y altura fijas. Permite // que el RecyclerView optimice mejor

         miRecicler.setHasFixedSize(true);

         miRecicler.setLayoutManager(new GridLayoutManager(this,2));
         //  miRecicler.setLayoutManager(new LinearLayoutManager(this));

         //Especificamos el adaptador con la lista a visualizar, al estar usando el linearlayoiut muestra los datos uno debajo de otro
        // si quisieramos mostrar los datos en dos columnas, no se pondría LinearLayoutManger por Grid Layout Manager
        //el spanCount es el numero de columnas pueden ser dos o tres
         miAdapter = new Adapter(DatosClientes());
         miRecicler.setAdapter(miAdapter);

         }

        public List<Clientes> DatosClientes() {

        List<Clientes> Lista = new ArrayList<>();

        Lista.add(new Clientes("Rey"));
        Lista.add(new Clientes("Gil"));
        Lista.add(new Clientes("Alonso"));
        Lista.add(new Clientes("Tovar"));
        Lista.add(new Clientes("Cerezo"));
        Lista.add(new Clientes("Arroyo"));
        Lista.add(new Clientes("Sala"));
        Lista.add(new Clientes("Martín"));
        Lista.add(new Clientes("Jimeno"));
        Lista.add(new Clientes("Muñoz"));
        Lista.add(new Clientes("Negro"));
        Lista.add(new Clientes("Fernández"));
        return Lista;
        }

        }


