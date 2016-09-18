/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Learning git 3 
 */
public class Exercise2 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        int soma = 0;
        
        for(int i = 0; i < 10; i++)
            vetor[i] = i;
        
        for(int i = 0; i < 10; i++)
           soma = soma + vetor[i];
        
        float media = (float)soma/vetor.length;
        System.out.println("Media dos valores: " +media);
    }
}
