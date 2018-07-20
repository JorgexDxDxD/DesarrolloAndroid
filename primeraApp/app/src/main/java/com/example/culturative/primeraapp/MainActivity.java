package com.example.culturative.primeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Modelo.UbicacionMiaPrro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("XD","hola amigos");

        EditText txtLong = (EditText) findViewById(R.id.mLong);
        EditText txtLat = (EditText) findViewById(R.id.mLat);
        txtLat.setText("-12");
        txtLong.setText("-77");

        try{
            Bundle receptor = this.getIntent().getExtras();
            UbicacionMiaPrro prro = (UbicacionMiaPrro) receptor.getSerializable("UBICACION");

            txtLat.setText(String.valueOf(prro.getLatitud()));
            txtLong.setText(String.valueOf(prro.getLongitud()));
        }
        catch (Exception ex){
            Log.e("No hay bundle", ex.getMessage());
        }


        final UbicacionMiaPrro ub = new UbicacionMiaPrro();
        ub.setLatitud(-12);
        ub.setLongitud(-77);

        Button btn_Empezar = (Button)findViewById(R.id.buttonCoordenadas);
        btn_Empezar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Bundle param = new Bundle();
                param.putSerializable("UBICACION",ub);
                Intent intent = new Intent(MainActivity.this, Mapa_Cultura.class);
                intent.putExtras(param);
                startActivity(intent);
                finish();
            }
        });
    }

}
