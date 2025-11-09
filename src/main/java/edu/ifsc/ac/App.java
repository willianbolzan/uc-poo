package edu.ifsc.ac;

public final class App {
    public static void main(String[] args) {
        Console console = new ConsoleUnix();

        Modalidades modalidades = new ModalidadesEmMemoria();

        Modalidade pesquisa = modalidades.adicionar(
                new ModalidadeSimples(
                        new Uuid("1"),
                        new NomeSimples("Pesquisa"),
                        0.40
                )
        );

        AtividadesComplementares atividadesComplementaresReferencia = new AtividadesComplementaresEmMemoria();

        AtividadeComplementar visitaTecnica = atividadesComplementaresReferencia.adicionar(
                new AtividadeComplementarDeReferencia(
                        new NomeSimples("Visita técnica"),
                        pesquisa,
                        20
                )
        );

        atividadesComplementaresReferencia.adicionar(visitaTecnica);

        Alunos alunos = new AlunosEmMemoria();

        // Caso de uso (domínio) + possíveis decorators (persistência, validação…)
        RegistrarAtividade registrar = new RegistrarAtividadeBasica();
        // Ex.: registrar = new RegistrarAtividadeQuePersiste(registrar, atividadesDoAlunoFactory);

        // Comandos de UI
        Opcao opcaoRegistrarAtividade = new OpcaoRegistrarAtividade(1, "Registrar Atividade",
                console, registrar, alunos, modalidades, atividadesComplementaresReferencia
        );

        // Menu
        new MenuBasico("Principal", opcaoRegistrarAtividade);
    }
}
