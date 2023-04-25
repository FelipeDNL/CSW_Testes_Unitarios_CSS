
package com.mycompany.entities;

public class ContaSalario extends Conta {
    public ContaSalario(Titular titular) {
        super(titular);
    }

    @Override
    public boolean sacar(float valor) {
        if (this.getSaldo() > (this.getSaldo() - valor)){
            this.sacar(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean pagarOnline(float valor){
        return false;
    }
}