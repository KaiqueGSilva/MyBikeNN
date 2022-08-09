package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservasActivity extends AppCompatActivity {
    FloatingActionButton fabReservar;
    DatePicker dtpReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservas_layout);

        fabReservar = findViewById(R.id.fabReservar);
        dtpReservar = findViewById(R.id.dtpReservas);

        fabReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Reserva realizada!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });


        int mes = dtpReservar.getMonth();
        int dia = dtpReservar.getDayOfMonth();
        int ano = dtpReservar.getYear();

        String montagem = "Você está no " + dia + "/" + mes + "/" + ano;
    }
}