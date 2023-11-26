package com.mycompany.jprime;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Jprime {
    private static Escola criarEscola() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome da escola:");
        String nome = input.nextLine();

        System.out.println("Digite o número ID:");
        int id = input.nextInt();
        input.nextLine(); 

        System.out.println("Digite o endereço:");
        String endereco = input.nextLine();

        System.out.println("Digite a data de fundação(##/##/####):");
        String dataFundacao = input.nextLine();

        return new Escola(nome,endereco,id,dataFundacao);
    }

    public static Diretor criarDiretor(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do(a) diretor(a)");
        String nome = input.nextLine();    

        System.out.println("Digite o número ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Digite a data de contratação(##/##/####): ");
        String dataContratação = input.nextLine();

        return new Diretor(nome, id, dataContratação);
    }

    public static Curso criarCurso(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do curso:");
        String nome = input.nextLine();

        System.out.println("Digite o número ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = input.nextLine();

        return new Curso(nome, id, descricao);
    }

    public static Professores criarProfessor (){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do(a) professor(a):");
        String nome = input.nextLine();

        System.out.println("Digite o número ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Digite a data de contratação(##/##/####): ");
        String dataContratacao = input.nextLine();     
        
        return new Professores(nome, id, dataContratacao);
    }

    public static Alunos criarAluno (){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do(a) aluno(a):");
        String nome= input.nextLine();
        
        System.out.println("Digite o número de matricula: ");
        int matricula = input.nextInt();
        input.nextLine();

        System.out.println("Digite a série: ");
        int serie = input.nextInt();
        input.nextLine();

        System.out.println("Digite a data da inscrição(##/##/####): ");
        String dataInscricao = input.nextLine();
        
        return new Alunos(nome, matricula, serie, dataInscricao);     
    }

    /* Obs: Não fechar nenhum input (pode dar erro); Para usar scanner em string use input.nextLine() (Tem varios exemplos no codigo);
     * Se for utilizar scanner para número use input.nextInt(); e na linha abaixo coloque o input.nextLine() (também tem varios exemplos no codigo);
     * 
     * Explicação: nada vai funcionar senão existir a primeira escola, então primeiro eu puxo a função 
     * de criar a primeira escola 
    */
    

    public static void main(String[] args) {
        while (true) { //serve para fazer o código sempre continuar rodando

            List<Escola> ListaEscolas;

            Scanner input = new Scanner(System.in);

            ListaEscolas = new ArrayList<>();

            System.out.println("GERENCIADOR DE ESCOLAS");
            System.out.println("Para iniciar, é preciso criar a primeira Escola");

            Escola escola1 = criarEscola();
            ListaEscolas.add(escola1);

            System.out.println("Também é preciso criar um diretor para a escola");            
            Diretor diretor1 = criarDiretor();
            escola1.adicionarDiretor(diretor1);
            escola1.listarDiretores();


            
                int acao=0;
                System.out.println("Pressione 1 para fechar");
                acao = input.nextInt();
                input.nextLine();
                if(acao==1) break;           
        }              
    }
}
