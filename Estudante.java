package Atividade1;

public class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;

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

    @Override
    public void exibirDados() {
        System.out.println("Estudante " + getNome() + " - Cpf: " + getCpf() + " - End. " + getEndereco() + " - Tel.: " + getTelefone() + ". Matricula: " + matricula);
    }
}
