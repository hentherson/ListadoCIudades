package com.uac.listadociudades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaciudades;
    ArrayList<String> ciudades = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ciudades.add("Armenia");
        ciudades.add("Barranquilla");
        ciudades.add("Bello");
        ciudades.add("Bogotá");
        ciudades.add("Bucaramanga");
        ciudades.add("Cali");
        ciudades.add("Cartagena");
        ciudades.add("Cúcuta");
        ciudades.add("Ibagué");
        ciudades.add("Manizales");
        ciudades.add("Medellin");
        ciudades.add("Montería");
        ciudades.add("Neiva");
        ciudades.add("Pasto");
        ciudades.add("Pereira");
        ciudades.add("Santa Marta");
        ciudades.add("Soacha");
        ciudades.add("Soledad");
        ciudades.add("Villavicencio");
        listaciudades = findViewById(R.id.lstciudades);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ciudades);
        listaciudades.setAdapter(adapter);

        listaciudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Ciudad: " + (ciudades.get(position)),Toast.LENGTH_LONG).show();
            }
        });
    }
}