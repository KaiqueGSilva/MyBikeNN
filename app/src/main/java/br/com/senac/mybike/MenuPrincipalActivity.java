package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardClient, cardReservation,
            cardMaintence, cardSales,
            cardAccessories, cardCatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardClient = findViewById(R.id.cardClient);
        cardReservation = findViewById(R.id.cardReservation);
        cardMaintence = findViewById(R.id.cardMaintence);
        cardSales = findViewById(R.id.cardSales);
        cardAccessories = findViewById(R.id.cardAccessories);
        cardCatalog = findViewById(R.id.cardCatalog);

        cardClient.setOnClickListener(this);
        cardReservation.setOnClickListener(this);
        cardMaintence.setOnClickListener(this);
        cardSales.setOnClickListener(this);
        cardAccessories.setOnClickListener(this);
        cardCatalog.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cardClient:
                startActivity(new Intent(getApplicationContext(),
                        ClientesActivity.class));
                break;
            case R.id.cardReservation:
                startActivity(new Intent(getApplicationContext(),
                        ReservasActivity.class));
                break;
            case R.id.cardMaintence:
                startActivity(new Intent(getApplicationContext(),
                        ManutencaoActivity.class));
                break;
            case R.id.cardSales:
                startActivity(new Intent(getApplicationContext(),
                        VendasActivity.class));
                break;
            case R.id.cardAccessories:
                startActivity(new Intent(getApplicationContext(),
                        AcessoriosActivity.class));
                break;
            case R.id.cardCatalog:
                startActivity(new Intent(getApplicationContext(),
                        CatalogosActivity.class));
                break;
        }

    }
}

