package edu.ifsc.vendas;

import edu.ifsc.vendas.data.DataDeNascimentoBasica;
import edu.ifsc.vendas.idade.IdadeBasica;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DataDeNascimento nascimento = new DataDeNascimentoBasica(LocalDate.of(1978, 3, 30));
        IdadeBasica idade = new IdadeBasica(nascimento);

        System.out.println(idade.valor());
    }
}
