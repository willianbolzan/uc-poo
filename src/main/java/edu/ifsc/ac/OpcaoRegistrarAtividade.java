package edu.ifsc.ac;

public class OpcaoRegistrarAtividade implements Opcao {
    private final int numero;
    private final String titulo;
    private final Console console;
    private final RegistrarAtividade registrar;
    private final Alunos alunos;                       // catálogo
    private final Modalidades modalidades;             // catálogo (se necessário)
    private final AtividadesComplementares atividadesRef;  // catálogo

    public OpcaoRegistrarAtividade(
            int numero,
            String titulo,
            Console console,
            RegistrarAtividade registrar,
            Alunos alunos,
            Modalidades modalidades,
            AtividadesComplementares atividadesRef
    ) {
        this.numero = numero;
        this.titulo = titulo;
        this.console = console;
        this.registrar = registrar;
        this.alunos = alunos;
        this.modalidades = modalidades;
        this.atividadesRef = atividadesRef;
    }

    @Override
    public String titulo() {
        return this.titulo;
    }

    @Override
    public int numero() {
        return this.numero;
    }

    @Override
    public void executar() {
        console.escrever("== Registrar atividade ==");

        console.escrever("Nome do aluno:");
        Nome nomeAluno = new NomeSimples(console.ler());
        Aluno aluno = alunos.com(nomeAluno); // ou criar se não existir, conforme sua política

        console.escrever("Nome da modalidade:");
        Nome nomeModalidade = new NomeSimples(console.ler());
        Modalidade mod = modalidades.com(new Uuid("1")); // buscar no catálogo

        console.escrever("Nome da atividade de referência:");
        Nome nomeAtv = new NomeSimples(console.ler());
        AtividadeComplementar ref = atividadesRef.com(nomeAtv, mod); // buscar/ref criar

        console.escrever("Horas a registrar:");
        int horas = Integer.parseInt(console.ler().trim()); // sem validações agora

        AtividadeComplementar rascunho = registrar.executar(aluno, ref, horas);

        console.escrever("Registrada: " + rascunho);
    }
}

