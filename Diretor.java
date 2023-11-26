package com.mycompany.jprime;

import java.util.Scanner;

public class Diretor {
    
    private String nomeDiretor;
    private int idDiretor;
    private String dataContratação;

    public Diretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
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
        Scanner input = new Scanner(System.in);

        System.out.println("Id diretor: ");
        idDiretor = input.nextInt();
        input.nextLine();
        System.out.println("Data de contratação: ");
        dataContratação = input.nextLine();

        input.close();
        return;
    }

    public void exibirInfo(){
        System.out.print(nomeDiretor);
        System.out.print(idDiretor);
        System.out.print(dataContratação);
    }
    
}
