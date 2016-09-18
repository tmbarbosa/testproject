/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiagomerino
 */
public class Exercise3 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        int mult = 1;
        
        for(int i = 0; i < 10; i++)
            vetor[i] = i + 1;
        
        for(int i = 0; i < 10; i++){
            mult = mult * vetor[i];
        }
        
        System.out.println("Multiplicacao de todos os valoress " +mult);
    }
    
}
