package com.mycompany.jprime;

import java.util.Scanner;

public class Professores {
    
    private String nome;
    private int id;
    private String dataContratacao;

    public Professores(String nome, int id, String dataContratacao) {
        this.nome = nome;
        this.id = id;
        this.dataContratacao = dataContratacao; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("O Professor deve ter um nome!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id != 0){
            this.id = id;
        } else {
            System.out.println("O Professor deve ter um Id!");
        }
    }

    public String getDataContratacao(){
        return dataContratacao;
    }

    public void setDataContratação(String dataContratacao){
        if(dataContratacao != null){
            this.dataContratacao = dataContratacao;
        } else {
            System.out.println("O Professor deve ter uma data de contratação!");
        }
    }

    public void criarProfessor (){
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Nome do Professor: ");
        nome = Sc.next();
        System.out.println("Id: ");
        id = Sc.nextInt();
        System.out.println("Data de contratação: ");
        dataContratacao = Sc.next();
        Sc.close();     
    }
    
    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Id: "+id);
        System.out.println("Data de contratação: "+dataContratacao);
    }
}
