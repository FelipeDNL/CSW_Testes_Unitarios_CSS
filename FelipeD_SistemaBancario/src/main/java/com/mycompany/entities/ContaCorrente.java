
package com.mycompany.entities;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Titular titular) {
        super(titular);
    }

    @Override
    public boolean sacar(float valor) {
        if (this.getSaldo() - valor > -this.getLimite()) {
            this.sacar(this.getSaldo() - valor);
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
