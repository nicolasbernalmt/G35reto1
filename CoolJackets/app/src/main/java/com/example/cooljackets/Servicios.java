package com.example.cooljackets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Servicios extends AppCompatActivity {
    Drawable drawable5, drawable6;
    ImageView reparaciones, envios;
    Button reparacionbt, enviobt;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.chaqueta);

        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.reparaciones, getTheme());
        reparaciones = (ImageView) findViewById(R.id.reparaciones);
        reparaciones.setImageDrawable(drawable5);

        Resources res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.envios, getTheme());
        envios = (ImageView) findViewById(R.id.envios);
        envios.setImageDrawable(drawable6);

        reparacionbt = (Button) findViewById(R.id.reparacionbt);
        reparacionbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "REPARACION SOLICITADA", Toast.LENGTH_LONG).show();
            }
        });

        enviobt = (Button) findViewById(R.id.enviobt);
        enviobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ENVIO SOLICITADO", Toast.LENGTH_LONG).show();
            }
        });
    }
}