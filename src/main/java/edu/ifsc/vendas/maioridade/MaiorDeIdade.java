package edu.ifsc.vendas.maioridade;


import edu.ifsc.vendas.Maioridade;

public class MaiorDeIdade implements Maioridade {
    @Override
    public String descricao() {
        return "Maior de Idade";
    }

    @Override
    public String simbolo() {
        return "18+";
    }
}
