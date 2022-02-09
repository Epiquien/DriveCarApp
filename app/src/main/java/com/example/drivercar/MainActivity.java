package com.example.drivercar;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton img_user_boton_mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_user_boton_mapa = findViewById(R.id.usuario_ubi_map);

        img_user_boton_mapa.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.usuario_ubi_map:
            mapa_usuario();
        }
    }

    private void mapa_usuario() {
        Intent i_mapa =new Intent(this, MapsActivity.class);
        startActivity(i_mapa);
    }
}