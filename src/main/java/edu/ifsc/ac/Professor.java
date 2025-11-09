package edu.ifsc.ac;
public interface Professor {
    Validacao validar(RequerimentoAtividade requerimento,
                      Parecer parecer,
                      Horas horasValidadas);
}
