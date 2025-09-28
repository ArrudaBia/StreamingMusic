package org.usuario;

public class Narrador extends Usuario {
    private String estiloNarracao;

    public Narrador(int id, String nome, String email, String estiloNarracao) {
        super(id, nome, email);
        this.estiloNarracao = estiloNarracao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Narrador: " + getNome() + " | Email: " + getEmail() + " | Estilo: " + estiloNarracao);
    }
    public void narrar(){
        System.out.println(getNome() + " está narrando um audiobook.");
    }

}




