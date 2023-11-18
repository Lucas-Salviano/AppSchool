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
public class Escola {

    private String nome;
    private String endereco;
    private int id;
    private int fundacao;
    private List<Curso> curso;
    private List<Diretor> diretor;

    public Escola(String nome, String endereco, int id, int fundacao, List<Curso> curso) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
        this.fundacao = fundacao;
        this.curso = new ArrayList<>();
        this.diretor = new ArrayList<>();
    }
    
    //add curso
     public void adicionarCurso(Curso cursos) {
        curso.add(cursos);
    }
     //remove curso
    public void removerAluno(Curso cursos) {
        curso.remove(cursos);
    }
    // add diretor
    public void adicionarCurso(Diretor direto) {
        diretor.add(direto);
    }
    // remove curso
    public void removerAluno(Diretor direto) {
        diretor.remove(direto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

   public void ExibirInfo(){
       System.out.println(nome);
       System.out.println(id);
       System.out.println(fundacao);
   }
}
