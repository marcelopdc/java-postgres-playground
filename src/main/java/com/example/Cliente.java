package com.example;

public class Cliente {

    private String cpf;
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente() {
        System.out.println("Criando um metodo construtor sem passagem de parâmetros");
        this.renda = 0;
        this.sexo = ' ';
        this.anoNascimento = 0001;
        double aleatorio = Math.random();
        if (aleatorio <= 0.5) {
            this.especial = true;
        }
        else {
            this.especial = false;
        }
    }
    public Cliente(double renda, char sexo, int anoNascimento, boolean especial) {
        this();
        System.out.println("Criando um metodo construtor COM passagem de parâmetros");
        setRenda(renda);
        this.sexo = sexo;
        this.anoNascimento = anoNascimento; 
        this.especial = true;      
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase().trim();
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
        if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f') {
             this.sexo = Character.toUpperCase(sexo);
        }
        else {
            System.out.println("\nSexo invalido");  
        }
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

}
