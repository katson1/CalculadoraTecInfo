package com.tecinfo.projeto.calculadora;

import android.app.Notification;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class activity_area extends AppCompatActivity {

    private ImageButton btnCirculo;
    private ImageButton btnTrapezio;
    private ImageButton btnLosango;
    private ImageButton btnTriangulo;
    private ImageButton btnParalelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#102770")));

        if (android.os.Build.VERSION.SDK_INT >= 21){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.notificationBarArea));
        }

        final Animation animAlpha = AnimationUtils.loadAnimation(this,
                R.anim.anim_alpha);

        btnCirculo = (ImageButton) findViewById(R.id.circulo);
        btnTrapezio = (ImageButton) findViewById(R.id.trapezio);
        btnLosango = (ImageButton) findViewById(R.id.losango);
        btnTriangulo = (ImageButton) findViewById(R.id.triangulo);
        btnParalelo = (ImageButton) findViewById(R.id.paralelo);

        btnCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_area.this, activity_area_circulo.class);
                startActivity(intent);

            }
        });
        btnTrapezio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_area.this, activity_area_trapezio.class);
                startActivity(intent);

            }
        });
        btnLosango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_area.this, activity_area_losango.class);
                startActivity(intent);

            }

        });
        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_area.this, activity_area_triangulo.class);
                startActivity(intent);

            }
        });
        btnParalelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

                Intent intent = new Intent(activity_area.this, activity_area_para.class);
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
