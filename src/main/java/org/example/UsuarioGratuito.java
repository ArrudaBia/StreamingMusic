package org.example;

public class UsuarioGratuito extends Usuario {
    private Boolean anuncio;

   public  UsuarioGratuito(int id, String nome, String email, boolean anuncio){
       super(id, nome, email);
       this.anuncio = anuncio;
   }

    @Override
    public void exibirInfo(){
       System.out.println("Usuário Gratuito: " + getNome() + " | Email: " + getEmail() + " | Exibe anúncios: " + anuncio);
   }

   public void ouvirAnuncio(){
       System.out.println(getNome()  + " está ouvindo um anúncio...");
   }
}
