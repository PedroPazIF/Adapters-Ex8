package com.example.adapters_ex8;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public String data;
    public String nome;
    public int img;  //R.drawable.xxx

    public Jogo(String nome,String data, int img) {
        this.nome = nome;
        this.data = data;
        this.img = img;
    }

    public static List<Jogo> getJogos(){
        List<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo("Valorant","2 de junho de 2020",R.drawable.valorant));
        jogos.add(new Jogo("TFT","26 de junho de 2019",R.drawable.tft));
        jogos.add(new Jogo("CounterStrike","21 de agosto de 2012",R.drawable.cs));
        jogos.add(new Jogo("Nba2k22",R.drawable.nba));
        jogos.add(new Jogo("Limbo",R.drawable.limbo));
        jogos.add(new Jogo("Spore",R.drawable.spore));
        jogos.add(new Jogo("Ori and the blind forest",R.drawable.ori));
        jogos.add(new Jogo("The sims 4",R.drawable.thesims));
        return jogos;
    }
}