package com.example.mariano.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by mariano on 30/10/2016.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);

        final EditText username = (EditText) findViewById(R.id.edit_user_name);
        final EditText pass = (EditText) findViewById(R.id.edit_pass);

        Button logueo = (Button) findViewById(R.id.boton_logueo);
        logueo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText().toString();
                Toast.makeText(SecondActivity.this, "Este es tu usuario: " + username.getText().toString() +
                    " y esta es tu contraseña " + pass.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
