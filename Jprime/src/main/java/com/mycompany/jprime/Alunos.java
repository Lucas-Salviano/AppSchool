package com.mycompany.jprime;

import java.util.Scanner;

public class Alunos {
    
    private String nome;
    private String matricula;
    private String serie;
    private String dataInscricao;

    public Alunos(String nome, String matricula, String serie, String dataInscricao) {
        this.nome = nome;
        this.matricula= matricula;
        this.serie=serie;
        this.dataInscricao=dataInscricao;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula != null){
            this.matricula = matricula;
        } else {
            System.out.println("O Aluno deve ter uma matrícula!");
        }
        
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        if(serie != null){
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
   
    public void exibirAlunos(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Série: "+serie);
        System.out.println("Data de inscrição: "+dataInscricao);     
    }
}