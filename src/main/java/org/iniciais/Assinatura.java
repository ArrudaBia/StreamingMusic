package org.iniciais;

public class Assinatura {
    private String tipo;
    private Double preco;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void renovar(){
        System.out.println("Assinatura " + tipo + " renovada por R$ " + preco);

    }
    public void exibir() {
        System.out.println("Assinatura: " + tipo + " | Preço: R$ " + preco);
    }
}
