package org.example;

public class UsuarioPremium extends Usuario
{
    private Double valorMensal;
    public UsuarioPremium(int id, String nome, String email, Double valorMensal) {
        super(id, nome, email);
        this.valorMensal = valorMensal;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário Premium: " + getNome() + " | Email: " + getEmail() + " | Mensalidade: R$" + valorMensal);
    }

  public void baixar(String conteudo){
        System.out.println(getNome() + " baixou: " + conteudo);
  }
}



