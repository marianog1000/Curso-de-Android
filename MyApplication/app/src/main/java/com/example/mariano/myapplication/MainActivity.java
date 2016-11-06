package com.example.mariano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.d("ACAMICA","MENSAJE de prueba");
        final Button segundaActividad = (Button) findViewById(R.id.boton_segunda_actividad);
        segundaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.acamica:
                Log.e("acamica", "tocamos el menú");
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
        return true;

    }

    @Override // cuando se descargo la clase antes de mostrar al usuario
    protected void onStart() {
        super.onStart();
        Log.e("acamica","onStart");
    }

    @Override // cuando el usuario ya lo puede ver en pantalla
    protected void onResume() {
        super.onResume();
        Log.e("acamica","onResume");
    }

    @Override // cuando cambiamos la actividad, y la actividad anterior no se muestra en pantalla
    protected void onPause() {
        super.onPause();
        Log.e("acamica","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("acamica","onStop");
    }

    @Override // cuando se elimina
    protected void onDestroy() {
        super.onDestroy();
    }
}
