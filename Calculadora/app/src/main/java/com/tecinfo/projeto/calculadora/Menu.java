package com.tecinfo.projeto.calculadora;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;


public class Menu extends AppCompatActivity {

    private ImageButton btnArea;
    private ImageButton btnBhask;
    private ImageButton btnPotencia;
    private ImageButton btnRadical;
    private ImageButton btnMatriz;
    private ImageButton btnVolume;
    private ImageButton btnIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final Animation animAlpha = AnimationUtils.loadAnimation(this,
                R.anim.anim_alpha);

        btnArea = (ImageButton) findViewById(R.id.area);
        btnBhask = (ImageButton) findViewById(R.id.bhask);
        btnPotencia = (ImageButton) findViewById(R.id.potencia);
        btnRadical = (ImageButton) findViewById(R.id.radical);
        btnMatriz = (ImageButton) findViewById(R.id.matriz);
        btnVolume = (ImageButton) findViewById(R.id.volume);
        btnIMC = (ImageButton) findViewById(R.id.imc);


        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_area.class);
                startActivity(intent);
            }
        });
        btnBhask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_bhask.class);
                startActivity(intent);

            }
        });
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_potencia.class);
                startActivity(intent);

            }
        });
        btnRadical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_radical.class);
                startActivity(intent);
            }
        });
        btnMatriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_matriz.class);
                startActivity(intent);
            }
        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_volume.class);
                startActivity(intent);

            }
        });
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(Menu.this, activity_IMC.class);
                startActivity(intent);

            }
        });

    }
}
