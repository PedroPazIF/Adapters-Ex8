package com.example.adapters_ex8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class JogoAdapter extends BaseAdapter {

    private final Context context;
    private final List<Jogo> jogos;

    public JogoAdapter(Context context, List<Jogo> jogos) {
        this.context = context;
        this.jogos = jogos;
    }

    @Override
    public int getCount() {
        return jogos.size();
    }

    @Override
    public Object getItem(int i) {
        return jogos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.adapter_jogo, viewGroup,false);
        TextView texto = (TextView) v.findViewById(R.id.txtJogo);
        ImageView img = (ImageView) v.findViewById(R.id.imgJogo);

        Jogo jogo = jogos.get(i);
        texto.setText(jogo.nome);
        img.setImageResource(jogo.img);

        return v;
    }
}