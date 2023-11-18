/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jprime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Curso {
 private String nome;
    private int id;
    private List<Alunos> alunos;
    private List<Professores> professores;

    public Curso(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    // Métodos para manipular a lista de alunos
    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        alunos.remove(aluno);
    }
    
    public void adicionarAluno(Professores professor) {
        professores.add(professor);
    }

    public void removerAluno(Professores professor) {
        professores.remove(professor);
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }

    // Getters e setters, se necessário
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void exibirInfo(){
    System.out.println(nome);
    System.out.println(id);
    }
}
