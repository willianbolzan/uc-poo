package edu.ifsc.vendas.produtos;


import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Produto;
import edu.ifsc.vendas.Produtos;

public class ProdutosMemoria implements Produtos {
    @Override
    public Produto buscarPorId(Id id) {
        return null;
    }

    @Override
    public Iterable<? extends Produto> todos() {
        return null;
    }

    @Override
    public void adicionar(Produto produto) {

    }
}
