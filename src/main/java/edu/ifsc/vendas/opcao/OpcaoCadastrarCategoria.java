
package edu.ifsc.vendas.opcao;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Categorias;
import edu.ifsc.vendas.Nome;
import edu.ifsc.vendas.Opcao;
import edu.ifsc.vendas.categoria.CategoriaSimples;
import edu.ifsc.vendas.console.Console;
import edu.ifsc.vendas.id.UuidRandom;
import edu.ifsc.vendas.nome.NomeSimples;
import edu.ifsc.vendas.nome.NomeValido;

public final class OpcaoCadastrarCategoria implements Opcao {
    private final int numero;
    private final String descricao;
    private final Console console;
    private final Categorias categorias;

    public OpcaoCadastrarCategoria(final int numero, final String descricao, final Console console, Categorias categorias) {
       this.numero = numero;
        this.descricao = descricao;
        this.console = console;
        this.categorias = categorias;
    }

    @Override
    public int numero() {
        return this.numero;
    }

    @Override
    public String descricao() {
       return this.descricao;
    }

    @Override
    public void executar() {
        this.console.escrever("Nome: ");
        String nome = this.console.ler();

        Nome nomevalidao = new NomeValido(new NomeSimples(nome));

        Categoria categoria = new CategoriaSimples(
                new UuidRandom(),
                new NomeValido(new NomeSimples(nome))
        );

        this.categorias.adicionar(categoria);

        this.console.escrever(
            String.format(
                "Categoria: %s cadastrada com sucesso\n",
                categoria.nome().valor()
            )
        );
    }
}
