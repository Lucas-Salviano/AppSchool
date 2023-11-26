package com.mycompany.jprime;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Jprime {
    

    public static void main(String[] args) {
        while (true) { //serve para fazer o código semprecontinuar rodando

            List<Escola> listaEscolas;

            Scanner input = new Scanner(System.in);

            listaEscolas = new ArrayList<>();

            System.out.println("GERENCIADOR DE ESCOLAS");
                System.out.println("Para iniciar, é preciso criar a primeira Escola");
                System.out.println("Qual o nome da escola?");
                String nomeEscola1 = input.nextLine();

                Escola Escola1 = new Escola(nomeEscola1);
                listaEscolas.add(Escola1);
                Escola1.criarEscola();
                Escola1.ExibirInfo();
                input.nextLine();

                /*Explicação: nada vai funcionar senão existir a primeira escola, então primeiro criamos ela
                então, puxo a função de criar a primeira escola assim e se for na classe "escola" pode ver que
                la na função "criar escola" ja puxa a "criar diretor" para que sejam criados os principais e primeiros elementos*/

            
                int acao=0;
                System.out.println("Pressione 1 para fechar");
                acao = input.nextInt();
                input.nextLine();
                if(acao==1) break;
            
            
        }
               
    }
}
