package com.tecinfo.projeto.calculadora;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class activity_volume extends AppCompatActivity {

    private ImageButton btnCone;
    private ImageButton btnCilindro;
    private ImageButton btnEsfera;
    private ImageButton btnPara;
    private ImageButton btnCubo;
    private ImageButton btnPrisma;
    private ImageButton btnPiramide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        final Animation animAlpha = AnimationUtils.loadAnimation(this,
                R.anim.anim_alpha);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4f150e")));

        if (android.os.Build.VERSION.SDK_INT >= 21){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.notificationBarVolume));
        }

        btnCone = (ImageButton) findViewById(R.id.cone);
        btnCilindro = (ImageButton) findViewById(R.id.cilindro);
        btnEsfera = (ImageButton) findViewById(R.id.esfera);
        btnPara = (ImageButton) findViewById(R.id.paralelepipedo);
        btnCubo = (ImageButton) findViewById(R.id.cubo);
        btnPrisma = (ImageButton) findViewById(R.id.prisma);
        btnPiramide = (ImageButton) findViewById(R.id.piramide);

        btnCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_cone.class);
                startActivity(intent);
            }
        });
        btnCilindro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_cilindro.class);
                startActivity(intent);
            }
        });
        btnEsfera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_esfera.class);
                startActivity(intent);
            }
        });
        btnCubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_cubo.class);
                startActivity(intent);
            }
        });
        btnPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_prisma.class);
                startActivity(intent);
            }
        });
        btnPiramide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_piramide.class);
                startActivity(intent);
            }
        });
        btnPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_volume.this, activity_volume_pipedo.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
