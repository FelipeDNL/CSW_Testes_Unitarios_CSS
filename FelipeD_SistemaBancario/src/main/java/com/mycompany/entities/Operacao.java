
package com.mycompany.entities;

import java.time.LocalDateTime;

public class Operacao {
    
    private String nomeOperacao;
    private double valorOperado;
    private LocalDateTime data;

    public Operacao (String nomeOperacao, double valorOperado) {
        this.nomeOperacao = nomeOperacao;
        this.valorOperado = valorOperado;
        this.data = LocalDateTime.now();
    }

    public String getNomeOperacao() {
        return nomeOperacao;
    }

    public void setNome(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

    public double getValor() {
        return valorOperado;
    }

    public void setValor(double valor) {
        this.valorOperado = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
