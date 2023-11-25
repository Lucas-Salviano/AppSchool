package com.mycompany.jprime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    
    private String nome;
    private int id;
    private String descricao;
    private List<Alunos> alunos;
    private List<Professores> professor;

    public Curso(String nome, int id, String descricao, List<Alunos> alunos, List<Professores> professor) {
        this.nome = nome;
        this.id = id;
        this.alunos = new ArrayList<>();
        this.professor = new ArrayList<>();

    }

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        alunos.remove(aluno);
    }

    public void adicionarProfessor(Professores Professor){
        professor.add(Professor);
    } 

    public List<Alunos> getAlunos() {
        return alunos;
    }

    public List<Professores> getProfessor() {
        return professor;
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
    
    public void criarCurso(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Nome do curso: ");
        nome = Sc.next();
        System.out.println("Id: ");
        id = Sc.nextInt();
        System.out.println("Descrição: ");
        descricao = Sc.next();

        Sc.close();
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Id: "+id);
        System.out.println("Professor responsável: "+professor.get(0));
        System.out.println("Descrição: "+descricao);
    }
}
