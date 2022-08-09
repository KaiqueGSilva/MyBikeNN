package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CatalogosActivity extends AppCompatActivity {

    RecyclerView idRecCatalogo;
    List<Bike> listabikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogos_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        listabikes = new ArrayList<>();
        //Criando a lista de bicicletas
        //instanciar e inserir os valores das bikes
        listabikes.add(new Bike("Bike Classica", "R$ 4.500,00", "45", R.drawable.bike_classica));
        listabikes.add(new Bike("Bike Ckeck", "R$ 2.350,00", "9", R.drawable.bicke_check));
        listabikes.add(new Bike("Bike Adviatica", "R$ 3.135,00", "12", R.drawable.bike_adviatica));
        listabikes.add(new Bike("Bike Bags", "R$ 8.322,50", "2", R.drawable.bike_bags));
        listabikes.add(new Bike("Bike Elétrica", "R$ 14.200,00", "3", R.drawable.bike_eletrica));
        listabikes.add(new Bike("Bike Gece", "R$ 1.150,00", "30", R.drawable.bike_gece));
        listabikes.add(new Bike("Bike Henk", "R$ 5.500,00", "10", R.drawable.bike_henk));
        listabikes.add(new Bike("Bike Passion", "R$ 6.635,00", "6", R.drawable.bike_passion));
        listabikes.add(new Bike("Bike Severino", "R$ 5.325,20","7", R.drawable.bike_severino));
        listabikes.add(new Bike("Bike Verde Menta", "R$ 8.759,00", "2", R.drawable.bike_verde_menta));

        //Instanciar a classe adaptadora

        MyAdapterBike adapterBike = new MyAdapterBike(getApplicationContext(), listabikes);

        //Definir o tipo de gerenciador de layout para grid
       idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

       //Layout do tipo linear
        //idRecCatalogo.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //Deixando a lista mais flexível
        idRecCatalogo.setHasFixedSize(true);


        idRecCatalogo.setAdapter(adapterBike);


    }
}