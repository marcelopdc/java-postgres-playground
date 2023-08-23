package com.example;

public class AppClasses {

   public static void main (String args[]) {

      Cliente cliente  = new Cliente();
  
      cliente.setNome("Manoel Campos");
      cliente.setRenda(1500);
      cliente.setSexo('M');
      cliente.setAnoNascimento(1979);
      cliente.setCpf("29049976875");

      String vetCliente[] = cliente.getNome().split(" ");
      System.out.println("Nome :"+vetCliente[0]);
      System.out.println("Nome :"+vetCliente[1]);
    
      System.out.println("\nNome.........: " +cliente.getNome());
      System.out.println("Renda.........: " +cliente.getRenda());
      System.out.println("Sexo..........: " +cliente.getSexo());
      System.out.println("Ano Nascimento: " +cliente.getAnoNascimento());
      System.out.println("Cliente Especial?: " +cliente.isEspecial());
      System.out.println("\n");

      Cliente cliente2 = new Cliente(1900,'F', 1985, true);
      cliente2.setNome("     Veronica");
      cliente2.setCpf("29049976875");

      System.out.println("Nome..........: " +cliente2.getNome());
      System.out.println("Renda.........: " +cliente2.getRenda());
      System.out.println("Sexo..........: " +cliente2.getSexo());
      System.out.println("Ano Nascimento: " +cliente2.getAnoNascimento());
      System.out.println("Cliente Especial?: " +cliente2.isEspecial());
      System.out.println("\n");

      if (cliente.getCpf().equalsIgnoreCase(cliente2.getCpf())) {
         System.out.println("Clientes com o mesmo CPF \n");
      }

   }
    
}
