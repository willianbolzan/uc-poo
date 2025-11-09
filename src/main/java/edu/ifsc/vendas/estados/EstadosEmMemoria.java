package edu.ifsc.vendas.estados;


import edu.ifsc.vendas.Estado;
import edu.ifsc.vendas.Estados;
import edu.ifsc.vendas.Id;

import java.util.HashMap;
import java.util.Map;

public class EstadosEmMemoria implements Estados {
    private final Map<Id, Estado> estados;

    public EstadosEmMemoria() {
        estados = new HashMap<>();

    }

    @Override
    public Iterable<Estado> todos() {
        return estados.values();
    }

    @Override
    public Estado buscaPorId(int id) {
        if (!estados.containsKey(id)) {
            throw new IllegalArgumentException("vendas.Estado com ID " + id + " não encontrado.");
        }
        return estados.get(id);
    }
}