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

public class Productos extends AppCompatActivity {

    Button buzosbt, chalecosbt, cuerobt, personalizadasbt;
    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView buzos, chalecos, cuero, personalizadas;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.chaqueta);


        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.buzos, getTheme());
        buzos = (ImageView) findViewById(R.id.buzos);
        buzos.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.chalecos, getTheme());
        chalecos = (ImageView) findViewById(R.id.chalecos);
        chalecos.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.cuero, getTheme());
        cuero = (ImageView) findViewById(R.id.cuero);
        cuero.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.personalizadas, getTheme());
        personalizadas = (ImageView) findViewById(R.id.personalizadas);
        personalizadas.setImageDrawable(drawable4);


        buzosbt = (Button) findViewById(R.id.buzosbt);
        buzosbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BUZO COMPRADO", Toast.LENGTH_LONG).show();
            }
        });
        chalecosbt = (Button) findViewById(R.id.chalecosbt);
        chalecosbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CHALECO COMPRADO", Toast.LENGTH_LONG).show();
            }
        });
        cuerobt = (Button) findViewById(R.id.cuerobt);
        cuerobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CHAQUETA DE CUERO COMPRADA", Toast.LENGTH_LONG).show();
            }
        });
        personalizadasbt = (Button) findViewById(R.id.personalizadabt);
        personalizadasbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CHAQUETA PERSONALIZADA COMPRADA", Toast.LENGTH_LONG).show();
            }
        });

    }
}