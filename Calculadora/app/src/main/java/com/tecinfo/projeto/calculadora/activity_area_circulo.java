package com.tecinfo.projeto.calculadora;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_area_circulo extends AppCompatActivity {

    private Spinner selection;
    private ImageButton btn_selecionar;
    private String item;
    private ImageView raio;
    private ImageView diametro;
    private TextView r_ou_d;
    private TextView txt_rd;
    private TextView nome_rd;
    private EditText edt_rd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);

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

//        raio = (ImageView) findViewById(R.id.img_raio);
//        diametro = (ImageView) findViewById(R.id.img_diametro);
//        selection = (Spinner) findViewById(R.id.spinner_circulo);
//        r_ou_d = (TextView) findViewById(R.id.txt_r_or_d);
//        txt_rd = (TextView) findViewById(R.id.txt_texto_rd);
//        nome_rd = (TextView) findViewById(R.id.txt_raio_ou_diametro);
//        edt_rd = (EditText) findViewById(R.id.edt_r_ou_d);

//        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.selection_circle, android.R.layout.simple_spinner_item);
//        selection.setAdapter(adapter);

//        btn_selecionar = (ImageButton) findViewById(R.id.btn_circulo_selecionar);
//        btn_selecionar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                item = selection.getSelectedItem().toString();
//            }
//        });
//
//        if (item == "Área pelo raio"){
//            raio.setVisibility(View.VISIBLE);
//            diametro.setVisibility(View.INVISIBLE);
//            r_ou_d.setText("A = π.r²");
//            txt_rd.setText("Área pelo raio:");
//            nome_rd.setText("Raio:");
//            edt_rd.setHint("raio");

//        }
//        else{
//            raio.setVisibility(View.INVISIBLE);
//            diametro.setVisibility(View.VISIBLE);
//            r_ou_d.setText("A = π.(d/2)²");
//            txt_rd.setText("Área pelo diametro:");
//            nome_rd.setText("Diametro:");
//            edt_rd.setHint("diâmetro");

//        }

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
