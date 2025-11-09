package edu.ifsc.vendas;

import java.util.List;

public interface Menu {
    void adicionar(Opcao opcao);
    List<Opcao> opcoes();
    String descricao();
    void exibir();
}
