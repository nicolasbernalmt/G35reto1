 package com.example.cooljackets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     Button boton1;
     TextView texto1;

     Drawable drawable0;
     ImageView logo;

     private ActionBar actionBar;
     @Override
     protected void onStart() {
         super.onStart();
         Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();
     }
/**
     @Override
     protected void onResume() {
         super.onResume();
         Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onPause() {
         super.onPause();
         Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onStop() {
         super.onStop();
         Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
     }
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        //Poner el icono en la barra de inicio
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        //Imagen del logo en la pagina
        Resources res1 = getResources();
        drawable0 = res1.getDrawable(R.drawable.chaqueta, getTheme());
        logo = (ImageView) findViewById(R.id.logo);
        logo.setImageDrawable(drawable0);
        //Boton promociones
        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setText("Soon...");
                Toast.makeText(getApplicationContext(), "Pronto Sabras De Nuestras Nuevas Promociones" +
                        " Dejanos Tus Datos Personales Para Ser El Primero", Toast.LENGTH_LONG).show();
            }
        });
        texto1 = (TextView) findViewById(R.id.texto1);

    }
    //Menu opciones
    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menuopciones, menu);
         return true;

     }
     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos){
            Toast.makeText(getApplicationContext(), "Nuestros Productos", Toast.LENGTH_LONG).show();

        }
         if (id == R.id.servicios){
             Toast.makeText(getApplicationContext(), "Nuestros Servicios", Toast.LENGTH_LONG).show();
             Intent servicios = new Intent(this, Servicios.class);
             startActivity(servicios);
         }
         if (id == R.id.sucursales){
             Toast.makeText(getApplicationContext(), "Nuestras Sucursales", Toast.LENGTH_LONG).show();
             Intent sucursales = new Intent(this, Sucursales.class);
             startActivity(sucursales);
         }
         if (id == R.id.productos1){
             Toast.makeText(getApplicationContext(), "Nuestros Buzos", Toast.LENGTH_LONG).show();
             Intent productos = new Intent(this, Productos.class);
             startActivity(productos);
         }
         if (id == R.id.productos2){
             Toast.makeText(getApplicationContext(), "Nuestros Chalecos", Toast.LENGTH_LONG).show();
             Intent productos = new Intent(this, Productos.class);
             startActivity(productos);
         }
         if (id == R.id.productos3){
             Toast.makeText(getApplicationContext(), "Nuestras Chaquedas De Cuero", Toast.LENGTH_LONG).show();
             Intent productos = new Intent(this, Productos.class);
             startActivity(productos);
         }
         if (id == R.id.productos4){
             Toast.makeText(getApplicationContext(), "Nuestras Chaquetas Personalizadas", Toast.LENGTH_LONG).show();
             Intent productos = new Intent(this, Productos.class);
             startActivity(productos);
         }


         return super.onOptionsItemSelected(item);
     }

 }