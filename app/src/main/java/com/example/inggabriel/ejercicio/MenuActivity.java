package com.example.inggabriel.ejercicio;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MenuActivity extends AppCompatActivity {

    Spinner spn_Categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_menu);

        spn_Categoria = (Spinner)findViewById(R.id.spinner2);

        DesplegarCategorias();
    }

    public void DesplegarCategorias() {
        String Categorias[] = {"Deportes", "Tecnología", "Ciencia"};
        ArrayAdapter adc = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, Categorias);
        spn_Categoria.setAdapter(adc);
    }
}