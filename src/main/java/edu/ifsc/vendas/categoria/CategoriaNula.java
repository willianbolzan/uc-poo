package edu.ifsc.vendas.categoria;


import edu.ifsc.vendas.Categoria;
import edu.ifsc.vendas.Id;
import edu.ifsc.vendas.Nome;
import edu.ifsc.vendas.id.IdInvalido;
import edu.ifsc.vendas.nome.NomeSimples;

public final class CategoriaNula implements Categoria {

    @Override
    public Id id() {
        return new IdInvalido(); // ou IdSimples("NULO")
    }

    @Override
    public Nome nome() {
        return new NomeSimples("Categoria inexistente");
    }

    @Override
    public String toString() {
        return "(Categoria inexistente)";
    }
}

