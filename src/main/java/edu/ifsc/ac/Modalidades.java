package edu.ifsc.ac;
public interface Modalidades extends Iterable<Modalidade> {
    Modalidade com(Id id);
    Modalidade adicionar(Modalidade modalidade);

}
