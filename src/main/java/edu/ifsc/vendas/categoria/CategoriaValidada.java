package edu.ifsc.vendas.categoria;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;

public class CategoriaValidada implements Categoria {
    private final Categoria origin;

    public CategoriaValidada(final Categoria origin) {
        this.origin = origin;
    }

    @Override
    public Id id() {
        return origin.id();
    }

    @Override
    public Nome nome() {
        // Dispara validação ao acessar
        origin.nome().valor();
        return origin.nome();
    }
}


