package edu.ifsc.vendas.nome;


import edu.ifsc.vendas.Nome;

public class NomeSimples implements Nome {
    private final String valor;

    public NomeSimples(String valor) {
        this.valor = valor;
    }

    @Override
    public String valor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return valor();
    }


}
