package edu.ifsc.vendas.menu;


import edu.ifsc.vendas.Menu;
import edu.ifsc.vendas.Opcao;

import java.util.List;

public final class MenuComLoop implements Menu {
    private final Menu origem;
    public MenuComLoop(Menu origem) { this.origem = origem; }

    @Override
    public void adicionar(Opcao opcao) {
        this.origem.adicionar(opcao);
    }

    @Override
    public List<Opcao> opcoes() {
        return this.origem.opcoes();
    }

    @Override
    public String descricao() {
        return this.origem.descricao();
    }

    @Override
    public void exibir() {
        while (true) {
            origem.exibir();

        }
    }
}

