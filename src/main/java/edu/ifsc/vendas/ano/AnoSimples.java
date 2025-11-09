package edu.ifsc.vendas.ano;


import edu.ifsc.vendas.Ano;

public class AnoSimples implements Ano {
    private int valor;
    public AnoSimples(int valor) {
        this.valor = valor;
    }
    public int valor() {
        return valor;
    }
}
