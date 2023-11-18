/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jprime;

import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Alunos {
    
    private String nomeA;
    private int matricula;
    private int serie;
    //data de inscrição
    private int dataADia;
    private int dataAMes;
    private int dataAAno;

    public Alunos(String nomeA, int matricula, int serie, int dataADia, int dataAMes, int dataAAno) {
        this.nomeA = nomeA;
        this.matricula = matricula;
        this.serie = serie;
        this.dataADia = dataADia;
        this.dataAMes = dataAMes;
        this.dataAAno = dataAAno;
    }

    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getDataADia() {
        return dataADia;
    }

    public void setDataADia(int dataADia) {
        this.dataADia = dataADia;
    }

    public int getDataAMes() {
        return dataAMes;
    }

    public void setDataAMes(int dataAMes) {
        this.dataAMes = dataAMes;
    }

    public int getDataAAno() {
        return dataAAno;
    }

    public void setDataAAno(int dataAAno) {
        this.dataAAno = dataAAno;
    }
    
    public void criarAluno (){
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        nomeA = Sc.next();
        System.out.println("digite sua matricula: ");
        matricula = Sc.nextInt();
        System.out.println("digite sua Serie: ");
        serie = Sc.nextInt();
        System.out.println("digite a data da inscrição, dia: ");
        dataADia = Sc.nextInt();
        System.out.println("mes: ");
        dataAMes = Sc.nextInt();
        System.out.println("ano: ");
        dataAAno = Sc.nextInt();
        
    }
    
    public void exibirAlunos(){
        System.out.println(nomeA);
        System.out.println(matricula);
        System.out.println(serie);
        System.out.println(dataADia);
        System.out.println(dataAMes);
        System.out.println(dataAAno);
           
        
    }
    
    

}
