/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import View.ViewAddAluno;
import View.ViewAddCurso;
import View.ViewAddDiretor;
import View.ViewAddEscola;
import View.ViewAddProfessor;
import View.tela1;

/**
 *
 * @author lucas
 */
public class Controle {

    private final tela1 View;
    
    public Controle (tela1 View){
        this.View = View;
    
    }
    
    
    public void entraeCriarEscola(){
        ViewAddEscola escola = new ViewAddEscola();
        escola.setVisible(true);
        this.View.dispose();
    }
    public void entraeCriarCurso(){
        ViewAddCurso curso = new ViewAddCurso();
        curso.setVisible(true);
        this.View.dispose();
    }
    public void entraeCriarAluno(){
        ViewAddAluno aluno = new ViewAddAluno();
        aluno.setVisible(true);
        this.View.dispose();
    }
    public void entraeCriarDiretor(){
        ViewAddDiretor diretor = new ViewAddDiretor();
        diretor.setVisible(true);
        this.View.dispose();
    }
    public void entraeCriarProfessor(){
        ViewAddProfessor professor = new ViewAddProfessor();
        professor.setVisible(true);
        this.View.dispose();
    }
}
