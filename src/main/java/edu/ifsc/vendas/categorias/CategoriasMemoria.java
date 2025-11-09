package edu.ifsc.vendas.categorias;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Categorias;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.categoria.CategoriaNula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriasMemoria implements Categorias {
    private final Map<Id, Categoria> mapa;

    public CategoriasMemoria() {
        this.mapa = new HashMap<>();
    }

    @Override
    public void adicionar(Categoria categoria) {
        mapa.put(categoria.id(), categoria);
    }

    @Override
    public Categoria buscarPorId(final Id id) {
        return mapa.getOrDefault(id, new CategoriaNula());
    }



    @Override
    public List<Categoria> todos() {
        return new ArrayList<>(mapa.values());
    }

    @Override
    public void remover(Id id) {
        if (mapa.remove(id) == null) {
            throw new IllegalArgumentException("Não havia produto com id: " + id);
        }
    }
}
