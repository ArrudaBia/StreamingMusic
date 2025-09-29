package org.usuario;

public class Artista extends Usuario{
    private String generoMusical;

    public Artista(int id, String nome, String email, String generoMusical) {
        super(id, nome, generoMusical);
        this.generoMusical = generoMusical;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Artista: " + getNome() + " | Email: " + getEmail() + " | Gênero: " + generoMusical);
    }
    public void publicarConteudo(){
        System.out.println(getNome() + " publicou uma nova música/álbum." );

    }
}
