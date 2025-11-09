package edu.ifsc.ac;


import edu.ifsc.vendas.Opcao;

public class OpcaoSair implements Opcao {
    private final int numero;
    private String descricao;
    public OpcaoSair(final int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public int numero() {
        return this.numero;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public void executar() {
        System.exit(0);

    }
}
