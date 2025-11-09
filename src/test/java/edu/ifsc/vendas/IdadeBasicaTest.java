package edu.ifsc.vendas;


import edu.ifsc.vendas.data.DataDeNascimentoBasica;
import edu.ifsc.vendas.idade.IdadeBasica;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IdadeBasicaTest {

    @Test
    public void testIdadeComDataFixa() {

        LocalDate nascimento = LocalDate.of(1978, 3, 30);
        LocalDate referencia = LocalDate.of(2025, 11, 7);

        DataDeNascimento data = new DataDeNascimentoBasica(nascimento);
        IdadeBasica idade = new IdadeBasica(data, referencia);

        int resultado = idade.valor();

        // Assert
        assertEquals(47, resultado);
    }

    @Test
    public void testIdadeComDataAtual() {
        LocalDate nascimento = LocalDate.of(1978, 3, 30);
        DataDeNascimento data = new DataDeNascimentoBasica(nascimento);

        IdadeBasica idade = new IdadeBasica(data);
        int resultado = idade.valor();


        System.out.println("resultado:"+ resultado);
    }
}


