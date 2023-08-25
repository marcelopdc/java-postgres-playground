package com.example;
import java.time.LocalDate;

public class Cidadao {
    
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int idade() {

        return LocalDate.now().getYear() - getDataNascimento().getYear();
    }

    public String Eleitor() {

        int idade = idade();

        if (idade < 16) {
            return "Nao é Eleitor";
        } 

        if (idade > 15 && idade <18 || idade > 70) {
            return "É Eleitor Facultativo";  
        }   

        return "É eleitor obrigatório";   
    }
}
 