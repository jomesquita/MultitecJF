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
        
    
    switch(escolha){
        
        case 1:
    for(i=0; i<nome.length; i++){
    nome[i] = JOptionPane.showInputDialog("Digite seu nome");
    }
    break;
    
        case 2:
    for(i=0; i<nome.length; i++){
    System.out.println("Nome: "+nome[i]);
    }
    break;
    
        case 3:
    pesquisar = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar: ");
    logico=false;
    for(i=0; i<nome.length; i++){
    if (pesquisar.equals(nome[i])){
    JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " está cadastrado");
    logico=true;
    }
    }if(logico==false){JOptionPane.showMessageDialog(null, "O nome "+ pesquisar+ " não está cadastrado");}
    break;
    
        case 4:
    alterar = JOptionPane.showInputDialog("Digite o nome que deseja alterar: ");
    logico = false;
    for(i=0; i<nome.length; i++){
    if (alterar.equals(nome[i])){
    
    alterar = JOptionPane.showInputDialog("Digite o novo nome: ");
    nome[i] = alterar;
    logico=true;
    }
    }if (logico==false) {JOptionPane.showMessageDialog(null, "O nome "+ alterar+ " não está cadastrado");}
    break;
    
        case 5:
    excluir = JOptionPane.showInputDialog("Digite o nome que deseja excluir: ");
    logico = false;
    for(i=0; i<nome.length; i++){
    if (excluir.equals(nome[i])){
    nome[i] = "";
    
    logico=true;
    }
    
    }if(logico==false){JOptionPane.showMessageDialog(null, "O nome "+ excluir+ " não está cadastrado");}
    {
    break;
    
    }default:
        JOptionPane.showMessageDialog(null, "Valor inválido");
    }while(escolha!=6);
    
    }
}

