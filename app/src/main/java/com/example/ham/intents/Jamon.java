package com.example.ham.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ham on 17/11/2016.
 */
public class Jamon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamon);

        Bundle InfoMangos = getIntent().getExtras(); // Con este método se obtienen los extras mandados de la actividad anterior.
        if (InfoMangos==null)
        {
            return;     // Con esta condición delimitamos el envío de información desde otro recurso. Ej, otra actividad.
        }

        String MensajeMango = InfoMangos.getString("MensajeMango");

        final TextView txtJamon = (TextView) findViewById(R.id.txtJamon);
        txtJamon.setText(MensajeMango);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });


    }

    public void onClick(View view){  // El método onClick para brincar al otro Intent.

        Intent i = new Intent(this, Mango.class);
        startActivity(i);

    }

}
