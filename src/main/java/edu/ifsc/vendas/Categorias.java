package edu.ifsc.vendas;

import java.util.List;

public interface Categorias {
    Categoria buscarPorId(Id id);
    List<Categoria> todos();
void adicionar(Categoria categoria);
void remover(Id id);

}
