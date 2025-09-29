package org.conteudos;

import org.iniciais.Album;
import org.usuario.Artista;

public class Musica extends Conteudo{

    private Artista artista;
    private Album album;

    public Musica(int id, String titulo, double duracao, Artista artista, Album album){
        super(id, titulo, duracao);
        this.artista = artista;
        this.album = album;
    }

    public void tocar(){

        System.out.println("Tocando música: " + titulo + " | Artista: " + artista.getNome());
    }

    public Artista getArtista() {

        return artista;
    }
    public Album getAlbum() {
        return album;
    }

}
