package com.finan.orcamento.model;
import com.finan.orcamento.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private double precoAtual;
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPreco(double novoPreco) {
        this.precoAtual = novoPreco;
        notificarObservers();
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(precoAtual);
        }
    }
}