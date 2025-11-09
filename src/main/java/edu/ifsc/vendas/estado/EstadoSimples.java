package edu.ifsc.vendas.estado;


import edu.ifsc.vendas.Estado;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;

public class EstadoSimples implements Estado {
    private final Id id;
    private final Nome nome;

    public EstadoSimples(Id id, Nome nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override public Id id() { return id; }
    @Override public Nome nome() { return nome; }

    @Override
    public String toString() {
        return id + " - " + nome;
    }
}