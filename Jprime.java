package com.mycompany.jprime;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Jprime {
    

    public static void main(String[] args) {
        List<Escola> listaEscolas;

        Scanner input = new Scanner(System.in);

        listaEscolas = new ArrayList<>();

        System.out.println("GERENCIADOR DE ESCOLAS");
        System.out.println("Por favor, cadastre a primeira Escola:");
        System.out.println("Qual o nome da escola?");
        String nomeEscola1 = input.next();

        Escola Escola1 = new Escola(nomeEscola1);
        listaEscolas.add(Escola1);
        Escola1.criarEscola();
        Escola1.ExibirInfo();

        
        

        
    }
}
