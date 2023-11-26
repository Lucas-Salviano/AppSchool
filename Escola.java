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

    //String nome, String endereco, int id, String dataFundacao, List<Curso> cursos, List<Diretor> diretor

    public Escola(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.diretor = new ArrayList<>();
    }
    
    
     public void adicionarCurso() {
        Scanner input = new Scanner(System.in);
        System.out.println("É preciso cadastrar um curso.");
        System.out.println("Qual o nome do curso? ");
        String nomeCurso = input.nextLine();
        Curso Curso = new Curso(nomeCurso);
        Curso.criarCurso();
        cursos.add(Curso);
        
        input.close();
    }
    
    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
    
    public void adicionarDiretor() {
        Scanner input = new Scanner(System.in);
        System.out.println("É preciso cadastrar um diretor.");
        System.out.println("Qual o nome do diretor? ");
        String nomeDiretor = input.nextLine();
        Diretor Diretor = new Diretor(nomeDiretor);
        Diretor.CriarDiretor();
        diretor.add(Diretor);

        input.close();
    }

    /*public void removerDiretor(Diretor Diretor) {
        if(diretor.size()==0){
            System.out.println("Não há nenhum diretor para remover!");
        } else {
            diretor.remove(Diretor);
        }
        
    }*/

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
        Scanner input = new Scanner(System.in);

        System.out.println("Endereço: ");
        endereco = input.nextLine();
        System.out.println("Data de fundação (##/##/####): ");
        dataFundacao = input.nextLine();
        System.out.println("Id: ");
        id = input.nextInt();
        input.nextLine();

        adicionarDiretor();
        adicionarCurso();

        input.close();
        return;
        
    }

   public void ExibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Data de fundação: "+dataFundacao);
        System.out.println("Id: "+id);       
        System.out.println("Diretor: "+diretor);
        System.out.println(" ");
        /*System.out.println("Cursos: ");
        for (Curso i : cursos){
            System.out.println(i);
        }*/     
   }
}
