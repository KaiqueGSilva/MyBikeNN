package br.com.senac.mybike;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ConteudoActivity extends AppCompatActivity {

    //Declarar as variáveis no java
    BottomNavigationView bottomNavigationView;

    //Instanciando as janelas (Fragments)
    BikeFragment bikeFragment = new BikeFragment();
    ClienteFragment clienteFragment = new ClienteFragment();
    PreferenciasFragment preferenciasFragment = new PreferenciasFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conteudo_layout);

        //Apresentar o xml ao java
        bottomNavigationView = findViewById(R.id.idBottomNavView);

        //Carregamento do fragment default (Bike) na janela de conteudo
        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, bikeFragment)
                .commit();

        //Criando o clique nos itens do menu BottomView

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Criar o switch case para acessar o menu
                switch (item.getItemId()) {
                    case R.id.mBikes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, bikeFragment)
                                .commit();
                        return true;

                    case R.id.mClientes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, bikeFragment)
                                .commit();
                        return true;

                    case R.id.mPref:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, bikeFragment)
                                .commit();
                        return true;
                }

                return false;
            }
        });
    }
}
