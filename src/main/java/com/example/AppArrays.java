package com.example;

public class AppArrays {

    public static void main(String[] args) {
        
       int vetor[] = new int[5];
       int matriz[][] = new int[2][3];

       for (int i = 0; i < vetor.length; i++) {
         
          vetor[i] = 2 * i + 1;
          System.out.println("\nO valor é: " + vetor[i]);
        
       }

       for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = 2 * (i+j) + 1; 
            System.out.print("Matriz = " + matriz[i][j] + " ");         
          }
          System.out.println(" "); 
       }


    }
    
}
