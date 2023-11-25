package com.mycompany.jprime;

import java.util.Scanner;

public class Alunos {
    
    private String nome;
    private int matricula;
    private int serie;
    private String dataInscricao;

    public Alunos(String nome, int matricula, int serie, String dataInscricao) {
        this.nome = nome;
        this.matricula = matricula;
        this.serie = serie;
        this.dataInscricao = dataInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("O Aluno deve ter um nome!");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula != 0){
            this.matricula = matricula;
        } else {
            System.out.println("O Aluno deve ter uma matrícula!");
        }
        
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        if(serie != 0){
            this.serie = serie;
        } else {
            System.out.println("O Aluno deve ter uma série!");
        }
    }

    public String getDataInscricao(){
        return dataInscricao;
    }

    public void setDataInscrição(String dataInscricao){
        if(dataInscricao != null){
            this.dataInscricao = dataInscricao;
        } else {
            System.out.println("O Aluno deve ter uma data de inscrição!");
        }
    }
    
    public void criarAluno (){
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Nome do Aluno: ");
        nome = Sc.next();
        System.out.println("Matricula: ");
        matricula = Sc.nextInt();
        System.out.println("Serie: ");
        serie = Sc.nextInt();
        System.out.println("Data da inscrição: ");
        dataInscricao = Sc.next();
        Sc.close();      
    }
    
    public void exibirAlunos(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Série: "+serie);
        System.out.println("Data de inscrição: "+dataInscricao);     
    }
}
