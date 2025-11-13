/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.at2;
import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class model {
    int i;
    double media;
    double[] notas = new double[3];
    String n;
    public void cadastro(){
        //captura do nome escrito 
        String nome = JOptionPane.showInputDialog(null,
                "Digite o seu nome completo");
        n = nome;
    }
    public void notas(){
        for(i=0;i<3;i++){
        //usar um array pra guardar as notas
        String nota = JOptionPane.showInputDialog(null,
                "Digite a sua nota "+(this.i+1));
        notas[i] = Double.parseDouble(nota);
        JOptionPane.showMessageDialog(null, 
                notas[0]+" "+notas[1]+" "+notas[2]);
        }
    }
    public void calculo(){
        //usar parse pra ir de string pra double
        media = (notas[0]+notas[1]+notas[2])/3;
        System.out.println(media);
    }
    public void avaliacao(){
        //mostrar resultado
        if(media<6){
        JOptionPane.showMessageDialog(null, 
                "Infelizmente "+n+" você foi reprovado"+media);
        }else if(media<=9){
            JOptionPane.showMessageDialog(null, 
                "Parabens "+n+" você foi aprovado!");
        }else if(media>9){
            JOptionPane.showMessageDialog(null, 
                "Parabens "+n+" você teve um ótimo aproveitamento!");
        }
    }
}
