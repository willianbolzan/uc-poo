package edu.ifsc.vendas.categorias;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Categorias;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.categoria.CategoriaNumerada;

import java.util.ArrayList;
import java.util.List;

public final class CategoriasNumeradas implements Categorias {

    private final Categorias origin;

    public CategoriasNumeradas(final Categorias origin) {
        this.origin = origin;
    }

    @Override
    public Categoria buscarPorId(final Id id) {
        return this.origin.buscarPorId(id);
    }

    @Override
    public List<Categoria> todos() {
        final List<Categoria> originais = this.origin.todos();
        final List<Categoria> numeradas = new ArrayList<>();
        int contador = 1;

        for (final Categoria categoria : originais) {
            numeradas.add(new CategoriaNumerada(contador++, categoria)
            );
        }

        return numeradas;
    }

    @Override
    public void adicionar(final Categoria categoria) {
        this.origin.adicionar(categoria);
    }

    @Override
    public void remover(final Id id) {
        this.origin.remover(id);
    }
}


