package com.example.inggabriel.ejercicio;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner listEdades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEdades = (Spinner)findViewById(R.id.spinner);

        DesplegarEdades();
    }

    public void DesplegarEdades(){
        String Edades[]={"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"};

        ArrayAdapter ad = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Edades);

        listEdades.setAdapter(ad);
    }
}
