package org.iniciais;

public class Recomendacao {
    private String criterio;

    public Recomendacao(String criterio){
        this.criterio = criterio;
    }

    public void sugerir(){
        System.out.println("Recomendação gerada: " + criterio);

    }
}
