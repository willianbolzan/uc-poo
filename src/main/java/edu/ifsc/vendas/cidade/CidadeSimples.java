package edu.ifsc.vendas.cidade;


import edu.ifsc.vendas.*;

public class CidadeSimples implements Cidade {
    private final Nome nome;
    private final Estado estado;
    private final Numero populacao;
    private final Ano fundacao;

    public CidadeSimples(Nome nome, Estado estado, Numero populacao, Ano fundacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
        this.fundacao = fundacao;
    }

    @Override public Nome nome() { return nome; }
    @Override public Estado estado() { return estado; }
    @Override public Numero populacao() { return populacao; }
    @Override public Ano fundacao() { return fundacao; }




}