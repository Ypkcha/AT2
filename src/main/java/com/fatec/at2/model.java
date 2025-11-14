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
    String nome;
    public void cadastro(){
        //captura do nome escrito 
        String n = JOptionPane.showInputDialog(null,
                "Digite o seu nome completo");
        nome = n;
    }
    public void notas(){
        for(i=0;i<3;i++){
        //usar um array pra guardar as notas
        String nota = JOptionPane.showInputDialog(null,
                "Digite a sua nota "+(this.i+1));
        notas[i] = Double.parseDouble(nota);
        }
    }
    public void calculo(){
        //usar outra variável pra calcular
        media = (notas[0]+notas[1]+notas[2])/3;
        System.out.println(media);
    }
    public void avaliacao(){
        //mostrar resultado
        if(media<6){
        JOptionPane.showMessageDialog(null, 
                "Infelizmente "+nome+" você foi reprovado");
        }else if(media<=9){
            JOptionPane.showMessageDialog(null, 
                "Parabens "+nome+" você foi aprovado!");
        }else if(media>9){
            JOptionPane.showMessageDialog(null, 
                "Parabens "+nome+" você teve um ótimo aproveitamento!");
        }
    }
}
