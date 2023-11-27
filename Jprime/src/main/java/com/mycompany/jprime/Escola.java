package com.mycompany.jprime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escola {

    private String nome;
    private String endereco;
    private int id;
    private String dataFundacao; 
    private List<Curso> ListaCursos;
    private List<Diretor> ListaDiretores;

    public Escola(String nome, String endereco, int id, String dataFundacao) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.ListaCursos = new ArrayList<>();
        this.ListaDiretores = new ArrayList<>();      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("A escola deve ter um nome!");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco != null){
            this.endereco = endereco;
        } else {
            System.out.println("A escola deve ter um endereco!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id != 0){
            this.id = id;
        } else {
            System.out.println("A escola deve ter um Id!");
        }
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        if(dataFundacao != null){
            this.dataFundacao = dataFundacao;
        } else {
            System.out.println("A escola deve ter uma data de fundação!");
        }
    }

    public List<Curso> getCurso() {
        return ListaCursos;
    }

    public List<Diretor> getDiretor() {
        return ListaDiretores;
    }

    public void setCurso(List<Curso> curso) {
        this.ListaCursos = curso;
    }

    public void adicionarCurso(Curso curso) {
        ListaCursos.add(curso);
    }
    
    public void removerCurso(Curso curso) {
        ListaCursos.remove(curso);
    }
    
    public void adicionarDiretor(Diretor diretor) {
        ListaDiretores.add(diretor);
    }

    public void removerDiretor(Diretor diretor) {
       ListaDiretores.remove(diretor);
    }

    public void listarDiretores() {
        for (Diretor diretor : ListaDiretores) {
            System.out.println("Diretor: " + diretor.getNomeDiretor() + ", ID: " + diretor.getIdDiretor() + ", Data de Contratação: " + diretor.getDataContratação());
        }
    }

   public void ExibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Data de fundação: "+dataFundacao);
        System.out.println("Id: "+id);       
        System.out.println("Diretor: ");
        System.out.println(" ");
        /*System.out.println("Cursos: ");
        for (Curso i : cursos){
            System.out.println(i);
        }*/     
   }
}
