package com.example;
import java.util.ArrayList;
import java.util.List;

public class AppListas {

    public static void main (String args[]) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();

        List<Cliente> listaClientes = new ArrayList<>();

        cliente1.setNome("Marcelo");
        cliente1.setCpf("29049976875");
        cliente1.setAnoNascimento(1979);
        cliente1.setEspecial(false);
        cliente1.setRenda(1900);
        cliente1.setSexo('m');

        cliente2.setNome("Bruna");
        cliente2.setCpf("29049976875");
        cliente2.setAnoNascimento(1979);
        cliente2.setEspecial(false);
        cliente2.setRenda(1985);
        cliente2.setSexo('f');

        cliente3.setNome("Benicio");
        cliente3.setCpf("29049976875");
        cliente3.setAnoNascimento(1979);
        cliente3.setEspecial(false);
        cliente3.setRenda(1985);
        cliente3.setSexo('m');

        cliente4.setNome("maite");
        cliente4.setCpf("29049976875");
        cliente4.setAnoNascimento(1979);
        cliente4.setEspecial(false);
        cliente4.setRenda(1985);
        cliente4.setSexo('f');
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        listaClientes.remove(0);
        listaClientes.remove(cliente4);
        int i = listaClientes.size() - 1;
        listaClientes.remove(i);
        
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        } 
    }
}
