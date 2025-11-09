package edu.ifsc.vendas;

public interface Estados {
    Iterable<Estado> todos();
    Estado buscaPorId(int id);
}