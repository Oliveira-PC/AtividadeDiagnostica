package Atividade1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;
    private List<Notas> notas;
    private static Logger logger = new Logger();

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
            System.out.println(getNome() + " - Cpf: " + getCpf() + " - End. "
            + getEndereco() + " - Tel.: " + getTelefone() + ". Matricula: " + matricula);
    }
    
    public void exibirNotaEst() {
   
        System.out.println("chegou ate class estudante");
        for (Notas n : notas) {
            System.out.println("comeco for notas");
            System.out.println(getNome());
            logger.addLog("exibirNotaEst:" + getNome() + " n.exibirDados");
            n.exibirDados();
            }
        System.out.println("Saiu for notas");
       
        
    }
      
    public void adicionarNotas(Notas notas) {
        this.notas.add(notas);
    }
}
