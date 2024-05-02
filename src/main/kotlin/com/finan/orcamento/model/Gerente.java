package com.finan.orcamento.model;

import com.finan.orcamento.interfaces.Observer;

public class Gerente implements Observer {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(double preco) {
        if (preco > 1000) {
            System.out.println("Gerente " + nome + ": Item com preço acima de 1000 reais - " + preco);
        } else {
            System.out.println("Gerente " + nome + ": Item com preço abaixo de 1000 reais - " + preco);
        }
    }
}