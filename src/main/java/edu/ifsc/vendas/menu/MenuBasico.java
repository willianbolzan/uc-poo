package edu.ifsc.vendas.menu;


import edu.ifsc.vendas.Menu;
import edu.ifsc.vendas.Opcao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class MenuBasico implements Menu {
    private final String descricao;
    private final List<Opcao> opcoes;

    public MenuBasico(String descricao) {
        this.descricao = descricao;
        this.opcoes = new ArrayList<>();
    }

    public MenuBasico(String descricao, Opcao... opcoes) {
        this.descricao = descricao;
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
    public String descricao() {
        return descricao;
    }

    public void exibir() {


        System.out.print("\033[H\033[2J");
        System.out.flush();

            System.out.println(this.descricao);

            for (Opcao o : this.opcoes) {
                System.out.println(o.numero() + " - " + o.descricao());
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
