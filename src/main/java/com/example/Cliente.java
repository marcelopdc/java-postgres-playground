package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;

    public Cliente() {
        this.renda = 0;
        this.sexo = ' ';
        this.anoNascimento = 0001;
    }

    public double getRenda() {
        return this.renda;
    }
    public char getSexo() {
        return this.sexo;
    }
    public int getAnoNascimento() {
        return this.anoNascimento;
    }
    public void setRenda(double renda) {
        if (renda >= 0) {
            this.renda = renda;
        }
        else {
            System.out.println("\nSalario deve ser maior que zero");
        }
       
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
             this.sexo = sexo;
        }
        else {
            System.out.println("\nSexo invalido");  
        }
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
