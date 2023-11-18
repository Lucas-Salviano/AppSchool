/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jprime;

/**
 *
 * @author lucas
 */
public class Diretor {
    
    private String nomeDiretor;
    private int IDdiretor;
    //tada do dia do contrato
    private int dataDDia;
    private int dataDMes;
    private int dataDAno;

    public Diretor(String nomeDiretor, int IDdiretor, int dataDDia, int dataDMes, int dataDAno) {
        this.nomeDiretor = nomeDiretor;
        this.IDdiretor = IDdiretor;
        this.dataDDia = dataDDia;
        this.dataDMes = dataDMes;
        this.dataDAno = dataDAno;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public int getIDdiretor() {
        return IDdiretor;
    }

    public void setIDdiretor(int IDdiretor) {
        this.IDdiretor = IDdiretor;
    }

    public int getDataDDia() {
        return dataDDia;
    }

    public void setDataDDia(int dataDDia) {
        this.dataDDia = dataDDia;
    }

    public int getDataDMes() {
        return dataDMes;
    }

    public void setDataDMes(int dataDMes) {
        this.dataDMes = dataDMes;
    }

    public int getDataDAno() {
        return dataDAno;
    }

    public void setDataDAno(int dataDAno) {
        this.dataDAno = dataDAno;
    }
    
    public void exibirInfo(){
    System.out.print(nomeDiretor);
    System.out.print(IDdiretor);
    System.out.print(dataDDia);
    System.out.print(dataDMes);
    System.out.print(dataDAno);
    }
    
}
