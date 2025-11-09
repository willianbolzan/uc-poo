package edu.ifsc.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public final class AtividadesComplementaresEmMemoria implements AtividadesComplementares {
    private final List<AtividadeComplementar> todas = new ArrayList<>();

    @Override
    public AtividadeComplementar adicionar(AtividadeComplementar ref) {
        this.todas.add(ref);
        return null;
    }



    @Override
    public AtividadesComplementares daModalidade(Modalidade modalidade) {
        final AtividadesComplementaresEmMemoria filtrado = new AtividadesComplementaresEmMemoria();
        this.todas.stream()
                .filter(a -> a.modalidade().equals(modalidade))
                .forEach(filtrado::adicionar);
        return filtrado;
    }

    @Override
    public AtividadesComplementares comDescricaoContendo(String termo) {
        final AtividadesComplementaresEmMemoria filtrado = new AtividadesComplementaresEmMemoria();
        this.todas.stream()
                .filter(a -> a.descricao().valor().toLowerCase().contains(termo.toLowerCase()))
                .forEach(filtrado::adicionar);
        return filtrado;
    }

    @Override
    public AtividadeComplementar com(Nome nome, Modalidade modalidade) {
        return null;
    }


    @Override
    public String toString() {
        return this.todas.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public Iterator<AtividadeReferencia> iterator() {
        return null;
    }
}
