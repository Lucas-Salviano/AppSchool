package com.mycompany.jprime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escola {

    private String nome;
    private String endereco;
    private int id;
    private String dataFundacao; 
    private List<Curso> cursos;
    private List<Diretor> diretor;

    public Escola(String nome, String endereco, int id, String dataFundacao, List<Curso> cursos, List<Diretor> diretor) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
        this.dataFundacao = dataFundacao;
        this.cursos = new ArrayList<>();
        this.diretor = new ArrayList<>();
    }
    
    
     public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
    
    public void adicionarDiretor(Diretor Diretor) {
        diretor.add(Diretor);
    }

    public void removerDiretor(Diretor Diretor) {
        diretor.remove(Diretor);
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
        return cursos;
    }

    public List<Diretor> getDiretor() {
        return diretor;
    }

    public void setCurso(List<Curso> curso) {
        this.cursos = curso;
    }

    public void criarEscola(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Nome da escola: ");
        nome = Sc.next();
        System.out.println("Endereço: ");
        endereco = Sc.next();
        System.out.println("Id: ");
        id = Sc.nextInt();
        System.out.println("Data de fundação: ");
        dataFundacao = Sc.next();

        Sc.close();
    }

   public void ExibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Id: "+id);
        System.out.println("Endereço: "+endereco);
        System.out.println("Diretor responsável: "+diretor.get(0));
        System.out.println("Cursos: ");
        for (Curso i : cursos){
            System.out.println(i);
        }     
   }
}
