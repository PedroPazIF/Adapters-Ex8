package com.example.adapters_ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.lista);
        List<Jogo> jogos = Jogo.getJogos();
        listview.setAdapter(new JogoAdapter(this,jogos));
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Jogo p = (Jogo)adapterView.getAdapter().getItem(i);
        Toast.makeText(this,"Jogo: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}