
package com.mycompany.entities;

public class Conta {
    
    private Titular titular;
    protected float saldo;

    public Conta(Titular titular) {
        this.titular = titular;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean depositar(float valor){
        if(valor > 0){
            saldo += valor;
            return true;
        } else return false;
    }

    public boolean sacar(float valor){
        if(valor > 0 && getSaldo() >= valor){
            saldo -= valor;
            return true;
        } else return false;
    }

    public boolean pagarOnline(float valor){
        if(valor >= 0 && getSaldo() >= valor){
            saldo -= valor;
            return true;
        }else return false;
    }
    
}
