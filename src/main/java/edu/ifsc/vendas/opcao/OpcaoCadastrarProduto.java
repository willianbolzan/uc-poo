
package edu.ifsc.vendas.opcao;


import edu.ifsc.ac.NomeSimples;
import edu.ifsc.vendas.*;
import edu.ifsc.vendas.categorias.CategoriasNumeradas;
import edu.ifsc.vendas.console.Console;
import edu.ifsc.vendas.dinheiro.DinheiroBasico;
import edu.ifsc.vendas.id.Uuid;
import edu.ifsc.vendas.id.UuidRandom;
import edu.ifsc.vendas.produto.ProdutoSimples;

public final class OpcaoCadastrarProduto implements Opcao {


    @Override
    public int numero() {
        return 0;
    }

    @Override
    public String descricao() {
        return "";
    }

    @Override
    public void executar() {

    }
}
