package edu.ifsc.vendas.categoria;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;

public final class CategoriaNumerada implements Categoria {
    private final int numero;
    private final Categoria origin;

    public CategoriaNumerada(final int numero, final Categoria origin) {
        this.numero = numero;
        this.origin = origin;
    }

    public int numero() {
        return this.numero;
    }

    @Override
    public Id id() {
        return this.origin.id();
    }

    @Override
    public Nome nome() {
        return this.origin.nome();
    }

    @Override
    public String toString() {
        return numero + " - " + origin.nome().valor();
    }
}
