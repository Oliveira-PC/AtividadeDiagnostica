package Atividade1;

import java.util.ArrayList;

public class Notas {
    
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Media;
    private int Aprovado = 0;
    private int Recuperacao = 0;
    private int Reprovado = 0;

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
    
    public void exibirDados() {
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Nota 3: " + getNota3());
        System.out.println("Media: " + getMedia());
        Media = (Nota1 + Nota2 + Nota3)/3;
        
        if(Media>=7){
            System.out.println("Situação: Aprovado");
        } else if(Media >= 2.5){
            System.out.println("Situação: Recuperação");
        } else if(Media < 2.5){
            System.out.println("Situação: Reprovado");
        }
    }
    
    public void exibirStatus() {
        
        Media = (Nota1 + Nota2 + Nota3)/3;
        
        if(Media>=7){
            Aprovado += 1;
        } else if(Media >= 2.5){
            Recuperacao += 1;
        } else if(Media < 2.5){
            Reprovado += 1;
        }
    }
    
    public Notas(double Nota1, double Nota2, double Nota3) {
        
    }
}
