
package com.mycompany.entities;

import java.time.LocalDateTime;

public class Operacao {
    private String nome;
    private double valor;
    private LocalDateTime data;

    public Operacao (String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
