
package com.mycompany.entities;

public class ContaSalario extends Conta {
    
    public ContaSalario(Titular titular) {
        super(titular);
    }
    
    @Override
    public boolean pagarOnline(float valor){
        return false;
    }
}