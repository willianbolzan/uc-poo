package edu.ifsc.ac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class MenuBasico implements Menu {
    private final String titulo;
    private final List<Opcao> opcoes;


    public MenuBasico(String titulo, Opcao... opcoes) {
        this.titulo = titulo;
        this.opcoes = new ArrayList<>(Arrays.asList(opcoes));
    }

    @Override
    public void adicionar(Opcao opcao) {
        opcoes.add(opcao);
    }



    @Override
    public List<Opcao> opcoes() {
        return new ArrayList<>(opcoes);
    }

    @Override
    public String titulo() {
        return titulo;
    }


    public void exibir() {


        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(this.titulo);

        for (Opcao o : this.opcoes) {
            System.out.println(o.numero() + " - " + o.titulo());
        }

        System.out.println("\nOpção: ");
        int escolha = Integer.parseInt(new Scanner(System.in).nextLine());


        Opcao selecionada = null;
        for (Opcao o : this.opcoes) {
            if (o.numero() == escolha) {
                selecionada = o;
                break;
            }
        }

        if (selecionada != null) {
            selecionada.executar();
        } else {
            System.out.println("Opção inválida!\n");
        }


    }
}
