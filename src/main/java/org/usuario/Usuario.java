package org.usuario;

public class Usuario {

        private int id;
        private String nome;
        private String email;

        public Usuario(int id, String nome, String email) {
            this.id = id;
            this.nome = nome;
            this.email = email;
        }

        public void fazerLogin() {
            System.out.println(nome + " fez login.");
        }

        public void ouvirConteudo() {
            System.out.println(nome + " está ouvindo conteúdo.");
        }

        public void exibirInfo() {
            System.out.println("Usuário: " + nome + " | Email: " + email);
        }

        // Getters para outras classes usarem
        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }
    }


