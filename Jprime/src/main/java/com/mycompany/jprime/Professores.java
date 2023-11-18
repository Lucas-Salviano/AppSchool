/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jprime;

/**
 *
 * @author lucas
 */
public class Professores {
    
    private String nomeProfessor ;
    private int IDprofessor;
    // data do dia do contrato
    private int dataPDia;
    private int dataPMes;
    private int dataPAno;

    public Professores(String nomeProfessor, int IDprofessor, int dataPDia, int dataPMes, int dataPAno) {
        this.nomeProfessor = nomeProfessor;
        this.IDprofessor = IDprofessor;
        this.dataPDia = dataPDia;
        this.dataPMes = dataPMes;
        this.dataPAno = dataPAno;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getIDprofessor() {
        return IDprofessor;
    }

    public void setIDprofessor(int IDprofessor) {
        this.IDprofessor = IDprofessor;
    }

    public int getDataPDia() {
        return dataPDia;
    }

    public void setDataPDia(int dataPDia) {
        this.dataPDia = dataPDia;
    }

    public int getDataPMes() {
        return dataPMes;
    }

    public void setDataPMes(int dataPMes) {
        this.dataPMes = dataPMes;
    }

    public int getDataPAno() {
        return dataPAno;
    }

    public void setDataPAno(int dataPAno) {
        this.dataPAno = dataPAno;
    }
    
    public void exibirInfo(){
        System.out.println(nomeProfessor);
        System.out.println(IDprofessor);
        System.out.println(dataPDia);
        System.out.println(dataPMes);
        System.out.println(dataPAno);
    }
}
