package edu.ifsc.vendas;

public interface Produto {
    Id id();

    Nome nome();

    Dinheiro preco();

    Categoria nomeCategoria();
}
