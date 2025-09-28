package org.iniciais;

public class Album {

    private String titulo;
    private int ano;

    public Album(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void addMusica(String musica){

        System.out.println("Música adicionada ao álbum: " + musica);

    }

}


