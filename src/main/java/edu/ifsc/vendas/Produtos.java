package edu.ifsc.vendas;

public interface Produtos {
    Produto buscarPorId(Id id);

    Iterable<? extends Produto> todos();

    void adicionar(Produto produto);
}
