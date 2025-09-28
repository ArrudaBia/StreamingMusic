package org.usuario;

public class Apresentador extends Usuario{
    private String programa;

    public Apresentador(int id, String nome, String email, String programa){
        super(id,nome,email);
        this.programa = programa;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Apresentador: " + getNome() + " | Email: " + getEmail() + " | Programa: " + programa);
    }
    public void apresentar(){
        System.out.println(getNome()+ " está apresentando o programa: " + programa);
    }
}
