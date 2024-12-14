package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class Notas {
    
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Peso1;
    private double Peso2;
    private double Peso3;    
    private double Media;
    private String Disciplina;
    private int Aprovado = 0;
    private int Recuperacao = 0;
    private int Reprovado = 0;
    
    private static Logger logger = new Logger();
    
    public int getAprovado() {
        return Aprovado;
    }

    public void setAprovado(int Aprovado) {
        this.Aprovado = Aprovado;
    }

    public int getRecuperacao() {
        return Recuperacao;
    }

    public void setRecuperacao(int Recuperacao) {
        this.Recuperacao = Recuperacao;
    }

    public int getReprovado() {
        return Reprovado;
    }

    public void setReprovado(int Reprovado) {
        this.Reprovado = Reprovado;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }
    
    public double getMedia() {
        return Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }
    
    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }
       
    public void exibirDados() {
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Nota 3: " + getNota3());
        
        Media = getMedia();
        
        System.out.println("Media: " + Media);
        
        if(Media>=7){
            System.out.println("Situação: Aprovado");
        } else if(Media >= 2.5){
            System.out.println("Situação: Recuperação");
        } else if(Media < 2.5){
            System.out.println("Situação: Reprovado");
        }
       logger.addLog("Exibindo notas: ");
       logger.addLog("Nota 1: " + Nota1);
       logger.addLog("Nota 2: " + Nota2);
       logger.addLog("Nota 3: " + Nota3);
       logger.addLog("Media: " + Media);
    }
    
    public void exibirNotas(){
        
        System.out.println("Aprovados: " + getAprovado());
        System.out.println("Recuperação: " + getRecuperacao());
        System.out.println("Reprovados: " + getReprovado());
        
    }
       
    public Notas(double Nota1, double Nota2, double Nota3, double Media, int Aprovado, int Recuperacao, int Reprovado, String Disciplina) {
        
    }
}
