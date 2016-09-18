/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiagomerino
 */
public class Exercise1 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        
        for(int i = 0; i < 10; i++){
            vetor[i] = i;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("Conteudo da posicao ["+i+"] : "+vetor[i]);
        }
    }
    
}
