
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

    public Titular getTitular() {
        return titular;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void adicionarOperacao(String nome, double valor) {
        Operacao operacao = new Operacao(nome, valor);
        operacoes.add(operacao);
    }

    public List<Operacao> buscarOperacoesNome(String nome) {
        List<Operacao> resultado = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (titular.getNome().equals(nome)) {
                resultado.add(operacao);
            }
        }
        return resultado;
    }

    public List<Operacao> buscarOperacoesValor(double valor) {
        List<Operacao> resultado = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (operacao.getValor() == valor) {
                resultado.add(operacao);
            }
        }
        return resultado;
    }
    
}
