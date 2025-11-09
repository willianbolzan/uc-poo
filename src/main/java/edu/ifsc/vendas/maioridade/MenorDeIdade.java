package edu.ifsc.vendas.maioridade;


import edu.ifsc.vendas.Maioridade;

public class MenorDeIdade implements Maioridade {
    @Override
    public String descricao() {
        return "Menor de Idade";
    }

    @Override
    public String simbolo() {
        return "<18";
    }
}
