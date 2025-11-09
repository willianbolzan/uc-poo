package edu.ifsc.vendas.nome;


import edu.ifsc.vendas.Nome;

public class NomeComPrefixo implements Nome {
    private final Nome original;
    private final String prefixo;

    public NomeComPrefixo(Nome original, String prefixo) {
        this.original = original;
        this.prefixo = prefixo;
    }

    @Override
    public String valor() {
        return prefixo + " " + original.valor();
    }

    @Override
    public String toString() {
        return valor();
    }
}
