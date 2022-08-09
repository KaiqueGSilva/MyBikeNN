package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarBikeActivity extends AppCompatActivity {
    TextView txtMostrarTitulo, txtMostrarPreco, txtMostrarDisp;
    ImageView imgMostrarImagem;
    Button btnMostrarComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_bike_layout);

        txtMostrarTitulo = findViewById(R.id.txtMostraTitulo);
        txtMostrarPreco = findViewById(R.id.txtMostraPreco);
        txtMostrarDisp = findViewById(R.id.txtMostraDisp);

        imgMostrarImagem = findViewById(R.id.imgMostraImagem);

        btnMostrarComprar = findViewById(R.id.btnMostrarComprar);

        //Recebendo os valores que foram passados
        Intent intent = getIntent();

        String titulo, preco, disponivel;
        int imagem;

        titulo = intent.getExtras().getString("titulo");
        preco = intent.getExtras().getString("preco");
        disponivel = intent.getExtras().getString("disponivel");

        imagem = intent.getIntExtra("imagem", 0);

        //Inserindo os valores nos campos da janela

        txtMostrarTitulo.setText(titulo);
        txtMostrarPreco.setText(preco);
        txtMostrarDisp.setText(disponivel);

        imgMostrarImagem.setImageResource(imagem);

        btnMostrarComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Compra realizada com sucesso!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}