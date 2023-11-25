package com.mycompany.jprime;

import java.util.Scanner;

public class Diretor {
    
    private String nomeDiretor;
    private int idDiretor;
    private String dataContratação;

    public Diretor(String nomeDiretor, int idDiretor, String dataContratação) {
        this.nomeDiretor = nomeDiretor;
        this.idDiretor = idDiretor;
        this.dataContratação = dataContratação;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        if (nomeDiretor != null){
            this.nomeDiretor = nomeDiretor;
        } else {
            System.out.println("O diretor deve possuir um nome!");
        }
    }

    public int getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(int idDiretor) {
        if(idDiretor != 0){
            this.idDiretor = idDiretor;
        } else {
            System.out.println("O diretor deve possuir um Id!");
        }
    }

    public String getDataContratação(){
        return dataContratação;
    }

    public void setDataContratação(String dataContratação){
        if(dataContratação != null){
            this.dataContratação = dataContratação;
        } else {
            System.out.println("O diretor deve possuir uma data de contratação!");
        }
    }
    
    public void CriarDiretor(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Nome do diretor: ");
        nomeDiretor = Sc.next();
        System.out.println("Id: ");
        idDiretor = Sc.nextInt();
        System.out.println("Data de contratação: ");
        dataContratação = Sc.next();

        Sc.close();;
    }

    public void exibirInfo(){
        System.out.print(nomeDiretor);
        System.out.print(idDiretor);
        System.out.print(dataContratação);
    }
    
}
