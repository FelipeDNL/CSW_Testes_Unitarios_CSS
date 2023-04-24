
package com.mycompany.entities;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private Titular titular;
    private List<Operacao> operacoes;

    public Historico(Titular titular) {
        this.titular = titular;
        this.operacoes = new ArrayList<>();
    }
    
    public void adicionarOperacao(String nome, double valor) {
        Operacao operacao = new Operacao(nome, valor);
        operacoes.add(operacao);
    }

    public List<Operacao> buscarOperacoes(String nome) {
        List<Operacao> resultado = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (titular.getNome().equals(nome)) {
                resultado.add(operacao);
            }
        }
        return resultado;
    }

    public List<Operacao> buscarOperacoes(double valor) {
        List<Operacao> resultado = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (operacao.getValor() == valor) {
                resultado.add(operacao);
            }
        }
        return resultado;
    }
    
}
