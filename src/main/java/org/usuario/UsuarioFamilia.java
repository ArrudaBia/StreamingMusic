package org.example;

import org.usuario.Usuario;

public class UsuarioFamilia extends Usuario {
    private int numeroMembros;

    public UsuarioFamilia(int id, String nome, String email, int numeroMembros) {
        super(id, nome, email);
        this.numeroMembros = numeroMembros;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário Família: " + getNome() + " | Email: " + getEmail() + " | Número de membros: " + numeroMembros);
    }

    public void adicionarMembro() {
        numeroMembros++;
        System.out.println("Novo membro adicionado. Total agora: " + numeroMembros);
    }
}
