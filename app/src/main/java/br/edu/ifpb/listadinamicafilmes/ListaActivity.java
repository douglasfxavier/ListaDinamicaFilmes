package br.edu.ifpb.listadinamicafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {
    private ListView lvFilmes;
    private FloatingActionButton fabAddFilme;

    private List<String> listaFilmes;

    private ArrayAdapter<String> listaFilmesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lvFilmes = findViewById(R.id.lvFilmes);
        fabAddFilme = findViewById(R.id.fabAddFilme);

        listaFilmes = new ArrayList<String>();

        listaFilmesAdapter =
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        listaFilmes
                        );

        lvFilmes.setAdapter(listaFilmesAdapter);

        fabAddFilme.setOnClickListener(new FabAddFilmeOnClickListener());
    }

    private class FabAddFilmeOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

        }
    }
}