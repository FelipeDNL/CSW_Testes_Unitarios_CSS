
package com.mycompany.entities;

public class ContaCorrente extends Conta {
    
    private float limite;
    
    public ContaCorrente(Titular titular) {
        super(titular);
        limite = -300;
    }

    public float getLimite() {
        return limite;
    }
    
    @Override
    public boolean sacar(float valor) {
        if (valor > 0 && saldo - valor > limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean pagarOnline(float valor) {
        if (valor >= 0 && getSaldo() - valor > getLimite()){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
