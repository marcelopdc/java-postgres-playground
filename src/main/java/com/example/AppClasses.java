package com.example;

public class AppClasses {

   public static void main (String args[]) {

      Cliente cliente  = new Cliente();
      Cliente cliente2 = new Cliente();

      cliente.setRenda(-1500);
      cliente.setSexo('e');
      cliente.setAnoNascimento(1979);

      cliente2.setRenda(1900);
      cliente2.setSexo('F');
      cliente2.setAnoNascimento(1985);
    
      System.out.println("\nRenda.........: " +cliente.getRenda());
      System.out.println("Sexo..........: " +cliente.getSexo());
      System.out.println("Ano Nascimento: " +cliente.getAnoNascimento());
      System.out.println("\n");
      System.out.println("Renda.........: " +cliente2.getRenda());
      System.out.println("Sexo..........: " +cliente2.getSexo());
      System.out.println("Ano Nascimento: " +cliente2.getAnoNascimento());
      System.out.println("\n");

   }
    
}
