package edu.ifsc.vendas.numero;


import edu.ifsc.vendas.Numero;

public class NumeroSimples implements Numero {
    private int numero;
    public NumeroSimples(int numero) {
        this.numero = numero;

    }

    @Override
    public int valor() {
        return this.numero;
    }
}
