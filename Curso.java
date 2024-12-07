package Atividade1;

public class Curso {
    private String nome;
    private int semestres;
    private int coordenador;

    public Curso(String nome, int semestres, int coordenador) {
        this.nome = nome;
        this.semestres = semestres;
        this.coordenador = coordenador;
    }
    public int getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(int coordenador) {
        this.coordenador = coordenador;
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
