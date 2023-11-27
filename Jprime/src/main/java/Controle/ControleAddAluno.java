/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import View.ViewAddAluno;
import com.mycompany.jprime.Alunos;

/**
 *
 * @author lucas
 */
public class ControleAddAluno {

    private final ViewAddAluno View;
    private final Alunos com;
    
    public ControleAddAluno (ViewAddAluno View, Alunos com){
        this.View = View;
        this.com = com;
    
    }
    
    public void salvarInfo(){
        String nome = View.getTextNome().getText();
        String matricula = View.getTextMatricula().getText();
        String serie = View.getjTextSerie().getText();
        String data = View.getjTextDataInscrição().getText();
        
        Alunos a = new Alunos(nome, matricula, serie, data);
        
       a.exibirAlunos();
    }
    
    
}
