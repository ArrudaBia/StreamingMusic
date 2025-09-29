package org.iniciais;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int ano;
    private List<String> musicas;

    public Album(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public void addMusica(String musica) {
        musicas.add(musica);
        System.out.println("Música adicionada ao álbum: " + musica);
    }

    public void exibirInfo() {
        System.out.println("Álbum: " + titulo + " (" + ano + ")");
        System.out.println("Músicas: " + musicas);
    }
}



