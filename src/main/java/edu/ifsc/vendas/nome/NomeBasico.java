package edu.ifsc.vendas.nome;

import edu.ifsc.vendas.Nome;



public class NomeBasico implements Nome {
    private String nome;
    public NomeBasico(String nome) {
        this.nome = nome;
    }
    @Override
    public String valor() {
        return this.nome;
    }
}
