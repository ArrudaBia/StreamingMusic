package org.iniciais;

import org.usuario.Apresentador;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<String> conteudos;

    public Playlist(String nome) {
        this.nome = nome;
        this.conteudos = new ArrayList<>();
    }

    public Playlist(Apresentador apresentador, int i) {

    }

    public void addConteudo(String conteudo) {
        conteudos.add(conteudo);
        System.out.println("Conteúdo adicionado à playlist: " + conteudo);
    }

    public void reproduzir() {
        System.out.println("Reproduzindo playlist " + nome + ": " + conteudos);
    }
}

