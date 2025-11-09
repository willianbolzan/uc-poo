package edu.ifsc.ac;
public interface AtividadesComplementares extends Iterable<AtividadeReferencia> {
    AtividadeComplementar adicionar(AtividadeComplementar ref);
    AtividadesComplementares daModalidade(Modalidade modalidade);
    AtividadesComplementares comDescricaoContendo(String termo);

    AtividadeComplementar com(Nome nome, Modalidade modalidade);
}



