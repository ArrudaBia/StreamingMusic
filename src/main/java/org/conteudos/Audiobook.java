package org.conteudos;

import org.usuario.Narrador;

public class Audiobook extends Conteudo {
    private Narrador autor;
    private int capitulos;

    public Audiobook(int id, String titulo, int duracao, Narrador autor, int capitulos) {
        super(id, titulo, duracao);
        this.autor = autor;
        this.capitulos = capitulos;
    }

    public void ouvir() {
        System.out.println("Narrando audiobook: " + titulo + " | Narrador: " + autor.getNome());
    }

    // Getters e Setters
    public Narrador getAutor() { return autor; }
    public int getCapitulos() { return capitulos; }
}

