
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

    public void adicionarOperacao(Operacao operacao) {
        operacoes.add(operacao);
    }

    public List<Operacao> buscarPorOperacao(String operacaoBuscada) {
        List<Operacao> operacoesEncontradas = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (operacao.getNomeOperacao().equals(operacaoBuscada)) {
                operacoesEncontradas.add(operacao);
            }
        }
        return operacoesEncontradas;
    }

    public List<Operacao> buscarPorValor(double valorBuscado) {
        List<Operacao> operacoesEncontradas = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (operacao.getValor() == valorBuscado) {
                operacoesEncontradas.add(operacao);
            }
        }
        return operacoesEncontradas;
    }
}
