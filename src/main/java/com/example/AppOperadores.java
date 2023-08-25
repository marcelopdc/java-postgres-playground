package com.example;

public class AppOperadores {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setAnoNascimento(2001);

        Cliente cliente2 = new Cliente();
        cliente2.setAnoNascimento(2000);

        if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
            System.out.println("\nOs clientes nasceram em anos iguais");
        }else {
            System.out.println("\nOs clientes nasceram em anos diferentes "+ cliente1.getAnoNascimento() +" "+cliente2.getAnoNascimento());
        }
    }
}
