/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Multitec JF
 */
public class Cliente {
    public static void main(String[] args){
    String nome[] = new String[3];
    boolean logico = false;
    int escolha, i;
    String pesquisar;
    escolha = Integer.parseInt(JOptionPane.showInputDialog(nome));
        
    
    for(i=0; i<nome.length; i++){
    nome[i] = JOptionPane.showInputDialog("Digite seu nome");
    }
    
    
    for(i=0; i<nome.length; i++){
    System.out.println("Nome: "+nome[i]);
    }
    
    pesquisar = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar: ");
    for(i=0; i<nome.length; i++){
    }
}
}

