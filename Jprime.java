package com.mycompany.jprime;

import java.util.List;


public class Jprime {

    public static void main(String[] args) {
        
        
        Curso curso1 = new Curso("Ciência da Computação", 1);
        Curso curso2 = new Curso("Engenharia Elétrica", 2);
        
        Alunos aluno = new Alunos("adler",33454,3,16,06,3433);
        
        Alunos aluno2 = new Alunos("gir",43534,6,17,12,34535);
        
        curso1.adicionarAluno(aluno);
        curso2.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno2);
        
        //teste exibindo alunos e informações deles, isto deve ser melhorado
        
        List<Alunos> alunosCurso1 = curso1.getAlunos();
        for (Alunos alunos : alunosCurso1) {
            System.out.println("Aluno do curso 1: " + alunos.getNomeA());
            alunos.exibirAlunos();
        }
        
         List<Alunos> alunosCurso2 = curso2.getAlunos();
        for (Alunos alunos : alunosCurso2) {
            System.out.println("Aluno do curso 2: " + alunos.getNomeA());
            alunos.exibirAlunos();
        }
    }
}
