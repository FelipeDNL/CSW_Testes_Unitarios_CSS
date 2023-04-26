
package com.mycompany.entities;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    @Override
    public boolean sacar(float valor) {
        float taxa = valor * 0.05f;
        if(valor > 0 && getSaldo() >= valor + taxa){
            saldo -= valor + taxa;
            return true;
        } else return false;
    }
}
