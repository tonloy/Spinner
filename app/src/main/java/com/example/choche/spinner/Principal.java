package com.example.choche.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private String[] departamentos=new String[]{"Sonsonate","Santa Ana","Ahuachapán","Chalatenango","San Salvador"};
    private Spinner cmbxDepartamento;
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.cmbxDepartamento=(Spinner)findViewById(R.id.spinner);
        this.adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,this.departamentos);

        this.cmbxDepartamento.setAdapter(this.adaptador);
        this.cmbxDepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long i) {
                Toast.makeText(Principal.this,"El departamento seleccionado es: " +departamentos[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
