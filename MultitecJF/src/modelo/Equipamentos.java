/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Multitec JF
 */
public class Equipamentos {
    int codigo;
    String nome;
    
    void reservar(){
        System.out.println("O código da reserva é: " +this.codigo);
        System.out.println("A reserva é de: " +this.nome);
    }
}
