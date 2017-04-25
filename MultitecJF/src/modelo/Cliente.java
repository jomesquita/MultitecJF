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
    String pesquisar, alterar, excluir;
    escolha = Integer.parseInt(JOptionPane.showInputDialog(nome));
        
    
    for(i=0; i<nome.length; i++){
    nome[i] = JOptionPane.showInputDialog("Digite seu nome");
    }
    
    
    for(i=0; i<nome.length; i++){
    System.out.println("Nome: "+nome[i]);
    }
    
    pesquisar = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar: ");
    logico=false;
    for(i=0; i<nome.length; i++){
    if (pesquisar.equals(nome[i])){
    JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " está cadastrado");
    logico=true;
    }
    }if(logico==false){JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " não está cadastrado");}
    
    alterar = JOptionPane.showInputDialog("Digite o nome que deseja alterar: ");
    logico = false;
    for(i=0; i<nome.length; i++){
    if (pesquisar.equals(nome[i])){
    
    alterar = JOptionPane.showInputDialog("Digite o novo nome: ");
    nome[i] = alterar;
    logico=true;
    }
    }if (logico==false) {JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " não está cadastrado");}
    
    excluir = JOptionPane.showInputDialog("Digite o nome que deseja excluir: ");
    logico = false;
    for(i=0; i<nome.length; i++){
    if (excluir.equals(nome[i])){
    nome[i] = "";
    
    logico=true;
    }
    
    }if(logico==false){JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " não está cadastrado");}
    {
    }while(escolha!=6);
}
}

