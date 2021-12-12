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

public class Sucursales extends AppCompatActivity {
    Drawable drawable9;
    ImageView sucursal;
    Button sucursalbt;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.chaqueta);

        Resources res9 = getResources();
        drawable9 = res9.getDrawable(R.drawable.sucursales, getTheme());
        sucursal = (ImageView) findViewById(R.id.tiendas);
        sucursal.setImageDrawable(drawable9);

        sucursalbt = (Button) findViewById(R.id.sucursalbt);
        sucursalbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "PRONTO EN GOOGLE MAPS", Toast.LENGTH_LONG).show();
            }
        });
    }
}