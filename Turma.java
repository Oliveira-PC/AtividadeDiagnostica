package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String identificacao;
    private Curso curso;
    private int semestre;
    private Professor professor;
    private List<Estudante> estudantes;

    public Turma(String identificacao) {
        this.identificacao = identificacao;
        this.estudantes = new ArrayList<>();
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void exibirTurma() {
        System.out.println("Turma: " + identificacao + " - Curso: " + curso.getNome() + " - Semestre: " + semestre);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Estudantes: ");
        for (Estudante e : estudantes) {
            e.exibirDados();    
        }
        System.out.println();
    }
    
    public void exibirEstudante() {
        
        System.out.println("Estudantes: ");
        for (Estudante e : estudantes) {
            e.exibirNotaEst();
        }
        
    }
}
