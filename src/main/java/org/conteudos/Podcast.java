package org.conteudos;

import org.usuario.Apresentador;

public class Podcast extends Conteudo {
    private Apresentador apresentador;
    private int episodios;

    public Podcast(int id, String titulo, int duracao, Apresentador apresentador, int episodios) {
        super(id, titulo, duracao);
        this.apresentador = apresentador;
        this.episodios = episodios;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo podcast: " + titulo + " | Apresentador: " + apresentador.getNome());
    }

    public Apresentador getApresentador(){
        return apresentador;
    }
    public int getEpisodios(){
        return episodios;
    }
}
