package edu.ifsc.ac;
public interface Parecer {
    Horas decidir(Horas solicitadas, Horas limite);
    Descricao justificativa();
}
