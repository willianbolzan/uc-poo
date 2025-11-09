package edu.ifsc.vendas.produto;


import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;
import edu.ifsc.vendas.Produto;
import edu.ifsc.vendas.Dinheiro;
import edu.ifsc.vendas.Categoria;

public class ProdutoSimples implements Produto {
    private final Id id;
    private final Nome nome;
    private final Dinheiro preco;
    private final Categoria categoria;

    public ProdutoSimples(Id id, Nome nome, Dinheiro preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    @Override
    public Id id() {
        return this.id;
    }

    @Override
    public Nome nome() {
        return this.nome;
    }

    @Override
    public Dinheiro preco() {
        return this.preco;
    }

    @Override
    public Categoria nomeCategoria() {
        return this.categoria;
    }
}
