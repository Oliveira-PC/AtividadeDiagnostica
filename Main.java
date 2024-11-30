package Atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Estudante> estudantes = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Turma> turmas = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Notas> notas = new ArrayList<>();
    private static Logger logger = new Logger();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Curso");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Estudante");
            System.out.println("4. Cadastrar Turma");
            System.out.println("5. Cadastrar Notas");
            System.out.println("6. Exibir Turmas");
            System.out.println("7. Exibir Estudantes");
            System.out.println("8. Exibir numero de aprovados, recuperação e reprovados");
            System.out.println("9. Exibir Log");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Verificação para garantir que o usuário insira um número válido
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpar a entrada inválida
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCurso();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarEstudante();
                    break;
                case 4:
                    cadastrarTurma();
                    break;
                case 5:
                    cadastrarNotas();
                    break;    
                case 6:
                    exibirTurmas();
                    break;
                case 7:
                    exibirEstudantes();
                    break;
                case 8:
                    exibirEstudantes();
                    break;
                case 9:
                    exibirLog();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void cadastrarCurso() {
        System.out.print("Nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Quantidade de semestres: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido de semestres.");
            scanner.next();
        }
        int semestres = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        cursos.add(new Curso(nomeCurso, semestres));
        System.out.println("Curso cadastrado com sucesso!");
        
        logger.addLog("Cadastro de Curso - " + nomeCurso);
    }

    private static void cadastrarProfessor() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("SIAPE: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número de SIAPE válido.");
            scanner.next();
        }
        int siape = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        professores.add(new Professor(nome, cpf, endereco, telefone, siape));
        System.out.println("Professor cadastrado com sucesso!");
        
        logger.addLog("Cadastro de Professor - " + siape);
    }

    private static void cadastrarEstudante() {
        
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível. Cadastre um curso primeiro.");
            return;
        }
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Selecione o curso:");
        for (int j = 0; j < cursos.size(); j++) {
            System.out.println((j + 1) + ". " + cursos.get(j).getNome());
        }

        int cursoIndex = -1;
        do {
            System.out.print("Escolha uma opção de curso: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
            cursoIndex = scanner.nextInt() - 1;
        } while (cursoIndex < 0 || cursoIndex >= cursos.size());

        scanner.nextLine(); // Consumir a quebra de linha
        estudantes.add(new Estudante(nome, cpf, endereco, telefone, matricula, cursos.get(cursoIndex)));
        System.out.println("Estudante cadastrado com sucesso!");
        
        logger.addLog("Cadastro de Estudante - " + matricula);
    }

    private static void cadastrarTurma() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível. Cadastre um curso primeiro.");
            return;
        }
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor disponível. Cadastre um professor primeiro.");
            return;
        }
        
        System.out.print("Identificação da turma: ");
        String identificacao = scanner.nextLine();

        System.out.println("Selecione o curso:");
        for (int j = 0; j < cursos.size(); j++) {
            System.out.println((j + 1) + ". " + cursos.get(j).getNome());
        }
        int cursoIndex = -1;
        do {
            System.out.print("Escolha uma opção de curso: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
            cursoIndex = scanner.nextInt() - 1;
        } while (cursoIndex < 0 || cursoIndex >= cursos.size());

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Semestre: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número de semestre válido.");
            scanner.next();
        }
        int semestre = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Turma turma = new Turma(identificacao);
        turma.setCurso(cursos.get(cursoIndex));
        turma.setSemestre(semestre);

        System.out.println("Selecione o professor:");
        for (int j = 0; j < professores.size(); j++) {
            System.out.println((j + 1) + ". " + professores.get(j).getNome());
        }
        int professorIndex = -1;
        do {
            System.out.print("Escolha uma opção de professor: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
            professorIndex = scanner.nextInt() - 1;
        } while (professorIndex < 0 || professorIndex >= professores.size());

        scanner.nextLine(); // Consumir a quebra de linha
        turma.setProfessor(professores.get(professorIndex));

        System.out.println("Adicione estudantes à turma (digite o número correspondente ou 0 para parar):");
        while (true) {
            if (estudantes.isEmpty()) {
                System.out.println("Nenhum estudante cadastrado.");
                break;
            }

            for (int j = 0; j < estudantes.size(); j++) {
                System.out.println((j + 1) + ". " + estudantes.get(j).getNome());
            }
            int estudanteIndex = scanner.nextInt() - 1;
            if (estudanteIndex == -1) break;
            if (estudanteIndex >= 0 && estudanteIndex < estudantes.size()) {
                turma.adicionarEstudante(estudantes.get(estudanteIndex));
            } else {
                System.out.println("Estudante inválido.");
            }
        }

        turmas.add(turma);
        System.out.println("Turma cadastrada com sucesso!");
        
        logger.addLog("Cadastro de Turma - " + identificacao);
    }

    private static void cadastrarNotas(){
        while (true) {
        if (estudantes.isEmpty()) {
                System.out.println("Nenhum estudante cadastrado.");
                break;
            } 
        
        System.out.println("Selecione o Estudante ou digite 0 para cancelar):");
        
        for (int j = 0; j < estudantes.size(); j++) {
                System.out.println((j + 1) + ". " + estudantes.get(j).getNome());
            }
            int estudanteIndex = scanner.nextInt() - 1;
            if (estudanteIndex == -1) break;
            if (estudanteIndex >= 0 && estudanteIndex < estudantes.size()) {
                //Notas notas = new Notas(0, 0, 0);
                              
                System.out.print("Nota 1: ");
                double Nota1 = scanner.nextDouble();
                System.out.print("Nota 2: ");
                double Nota2 = scanner.nextDouble();
                System.out.print("Nota 3: ");
                double Nota3 = scanner.nextDouble();
                
                double Media = (Nota1 + Nota2 + Nota3)/3;
                
                int Aprovado = 0;
                int Recuperacao = 0;
                int Reprovado = 0;
                
                if(Media >= 7){
                    Aprovado += 1;
                } else if(Media >= 2.5){
                    Recuperacao += 1;
                } else if(Media < 2.5){
                    Reprovado += 1;
                }
                                                         
                notas.add(new Notas(Nota1, Nota2, Nota3, Media, Aprovado, Recuperacao, Reprovado));
                
                logger.addLog("Cadastro de Notas do estudante numero " + estudanteIndex);
                

            } else {
                System.out.println("Estudante inválido.");
            }
        }
        
    }
      
    private static void exibirTurmas() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
        } else {
            for (Turma turma : turmas) {
                turma.exibirTurma();
            }
        }
        
        logger.addLog("Exibir Turmas");
    }
    
    private static void exibirEstudantes() {
    while (true) {
        if (estudantes.isEmpty()) {
                System.out.println("Nenhum estudante cadastrado.");
                break;
            }
        for (Turma turma : turmas) {
                turma.exibirEstudante();
            }
        }
    
    logger.addLog("Exibir Estudante");
    
    }
    
    private static void exibirEstatistica(){
        if (notas.isEmpty()) {
            System.out.println("Nenhuma Nota cadastrada.");
        } else {
            for (Notas n : notas) {
            System.out.println("Numero de Aprovados, Reprovados e em Recuperação");
            System.out.println("");
            n.exibirNotas();
        }
        }
        
        logger.addLog("Exibir Numero de Aprovados, Reprovados e em Recuperação");
    }
    
    private static void exibirLog(){
        
        logger.showLogs();
        
    }
}
