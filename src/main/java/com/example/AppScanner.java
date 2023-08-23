package com.example;

import java.util.Scanner;

public class AppScanner {

   public static void main (String args[]) {

      Cliente cliente  = new Cliente();
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nDigite o nome......: ");
      cliente.setNome(scanner.nextLine());

      System.out.print("\nDigite o CPF.......: ");
      cliente.setCpf(scanner.nextLine());

      System.out.print("\nDigite sua renda...: ");
      cliente.setRenda(scanner.nextDouble());

      System.out.print("\nDigite o ano de Nascimento...: ");
      cliente.setAnoNascimento(scanner.nextInt());
      scanner.nextLine();

      System.out.print("\nDigite seu sexo....: ");
      String sexo = scanner.nextLine();
      cliente.setSexo(sexo.charAt(0));
      scanner.close();
    
      System.out.println("\nNome.........: " +cliente.getNome());
      System.out.println("Renda.........: " +cliente.getRenda());
      System.out.println("Sexo..........: " +cliente.getSexo());
      System.out.println("Ano Nascimento: " +cliente.getAnoNascimento());
      System.out.println("Cliente Especial?: " +cliente.isEspecial());
      System.out.println("\n");

      

   }
    
}
