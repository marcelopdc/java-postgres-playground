package com.example;

import java.time.LocalDate;

public class AppEleitor {

    public static void main(String[] args) {
        
        Cidadao cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1952, 8, 14));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.Eleitor());

    }
    
}
