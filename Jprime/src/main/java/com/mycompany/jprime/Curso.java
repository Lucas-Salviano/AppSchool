package com.mycompany.jprime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    
    private String nome;
    private int id;
    private String descricao;
    private List<Alunos> ListaAlunos;
    private List<Professores> Listaprofessor;

    public Curso(String nome, int id, String descricao) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.ListaAlunos = new ArrayList<>();
        this.Listaprofessor = new ArrayList<>();
    } 

    public List<Alunos> getAlunos() {
        return ListaAlunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        this.ListaAlunos = alunos;
    }

    public List<Professores> getProfessor() {
        return Listaprofessor;
    }

    public void setProfessor(List<Professores> Professor) {
        this.Listaprofessor = Professor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("O curso deve ter um nome!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id != 0){
            this.id = id;
        } else {
            System.out.println("curso deve ter um Id!");
        }
    }
    
    public void adicionarAluno(Alunos aluno) {
        ListaAlunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        ListaAlunos.remove(aluno);
    }

    public void adicionarProfessor(Professores professor){
        Listaprofessor.add(professor);      
    }

    public void removerProfessor(Professores professor) {
        Listaprofessor.remove(professor);
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Id: "+id);
        System.out.println("Professor responsável: ");
        System.out.println(" ");
        System.out.println("Descrição: "+descricao);
        System.out.println(" ");
        System.out.println("Alunos: ");
        for (Alunos i : ListaAlunos){
            System.out.println(i);
        }
    }
}
