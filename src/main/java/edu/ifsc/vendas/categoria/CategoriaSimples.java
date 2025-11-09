package edu.ifsc.vendas.categoria;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;

public class CategoriaSimples implements Categoria {
    private final Id id;
    private final Nome nome;
    public CategoriaSimples(Id id,Nome nome) {
        this.id = id;
        this.nome = nome;
    }
    @Override
    public Nome nome() {
        return this.nome;
    }

    @Override
    public Id id() {
        return this.id;
    }
}
