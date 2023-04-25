
package com.mycompany.entities;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    @Override
    public boolean sacar(float valor) {
        float taxaSaque = valor * 0.05f;
        if (this.getSaldo() >= taxaSaque) {
            this.sacar(this.getSaldo() - taxaSaque);
            return true;
        }
        return false;
    }

    @Override
    public boolean pagarOnline(float valor) {
        if (this.getSaldo() > (this.getSaldo() - valor)){
            this.sacar(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
