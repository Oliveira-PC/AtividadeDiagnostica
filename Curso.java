package Atividade1;

public class Curso {
    private String nome;
    private int semestres;

    public Curso(String nome, int semestres) {
        this.nome = nome;
        this.semestres = semestres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }
}
