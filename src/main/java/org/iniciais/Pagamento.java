package org.iniciais;

public class Pagamento {
    private String metodo;
    private Double valor;

    public Pagamento(String metodo, Double valor){
        this.metodo = metodo;
        this.valor = valor;
    }

    public void processar() {
        System.out.println("Pagamento processado via " + metodo + " | Valor: R$ " + valor);

    }
}
