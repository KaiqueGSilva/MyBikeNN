package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AcessoriosActivity extends AppCompatActivity {
    //Criando as variáveis globais
    BottomAppBar bottomAppBar;
    FloatingActionButton fabCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acessorios_layout);

        //apresentando o xml para o java
        bottomAppBar = findViewById(R.id.bottomBarAcessorios);
        fabCadastrar = findViewById(R.id.fabAcessorios);

        //Criando o clique no FAB
        fabCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no FAB",
                        Toast.LENGTH_SHORT).show();
            }
        });


        //criando o clique no navigationicon
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no icone do bottombar",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Criando o clique nos itens do menu bottomBar
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mAlterar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mExcluir:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}