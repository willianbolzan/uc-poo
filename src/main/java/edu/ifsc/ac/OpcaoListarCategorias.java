package edu.ifsc.ac;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Categorias;
import edu.ifsc.vendas.Opcao;

import java.util.List;

public final class OpcaoListarCategorias implements Opcao {
    private final int numero;
    private final String descricao;
    private final Categorias categorias;

    public OpcaoListarCategorias(int numero, String descricao, Categorias categorias) {
        this.numero = numero;
        this.descricao = descricao;
        this.categorias = categorias;
    }

    @Override
    public int numero() {
        return numero;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public void executar() {
        List<Categoria> lista = categorias.todos();
        System.out.println("\n--- Categorias cadastrados ---");
        for (Categoria categoria : lista) {
            System.out.println(categoria.id() + ": " + categoria.nome());
        }
    }
}

