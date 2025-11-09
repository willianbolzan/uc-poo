package edu.ifsc.vendas.nome;


import edu.ifsc.vendas.Nome;

public class NomeMaiusculo implements Nome {
    private final Nome original;

    public NomeMaiusculo(Nome original) {
        this.original = original;
    }

    @Override
    public String valor() {
        return original.valor().toUpperCase();
    }

    @Override
    public String toString() {
        return valor();
    }
}
