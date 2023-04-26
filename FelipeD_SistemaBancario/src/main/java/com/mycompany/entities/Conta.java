
package com.mycompany.entities;

public class Conta {
    private Titular titular;
    private float saldo;
    private float limite;

    public Conta(Titular titular) {
        this.titular = titular;
        this.limite = 300;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
    
    public boolean depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        } else return false;
    }

    public boolean sacar(float valor){
        if(valor > 0 && this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        } else return false;
    }

    public boolean pagarOnline(float valor){
        if(valor >= 0 && this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }else return false;
    }
    
}
