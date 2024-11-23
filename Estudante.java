package Atividade1;

import java.util.List;

public class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;
    private List<Notas> notas;


    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }    
           
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void exibirDados() {
        
        for (Notas n : notas) {
            System.out.println(getNome() + " - Cpf: " + getCpf() + " - End. " + getEndereco() + " - Tel.: " + getTelefone() + ". Matricula: " + matricula);
            n.exibirDados();
        }
    }
    
    public void adicionarNotas(Notas notas) {
        this.notas.add(notas);
    }
}
