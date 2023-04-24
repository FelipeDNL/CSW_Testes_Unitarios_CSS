
package com.mycompany.entities;

public class Conta {
    private TipoConta tipoConta;
    private Titular titular;
    private float saldo;
    private float limite;

    public Conta(Titular titular, TipoConta tipoConta) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.limite = 300;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
    
    public boolean depositar(float valor){
        this.saldo += valor;
        return true;
    }
    
    public boolean sacar(float valor){
        float taxaSaque = valor * 0.05f;
        if (tipoConta == TipoConta.POUPANCA && this.saldo >= taxaSaque) {
            this.saldo -= valor + taxaSaque;
            return true;
        }

        if (tipoConta == TipoConta.CORRENTE) {
            if (saldo - valor > -limite) {
                return false;
            } else {
                this.saldo -= valor;
                return true;
            }
        }
        
        if (tipoConta == TipoConta.SALARIO && this.saldo > (this.saldo - valor)){
            this.saldo -= valor;
            return true;
        }

        return false;
    }
    
    public boolean pagarOnline(float valor){
        if (tipoConta == TipoConta.POUPANCA && this.saldo > (this.saldo - valor)){
            this.saldo -= valor;
            return true;
        }

        if (tipoConta == TipoConta.CORRENTE && this.saldo > (this.saldo - valor)){
            this.saldo -= valor;
            return true;
        }
        
        if (tipoConta == TipoConta.SALARIO){
            return false;
        }

        return false;
    }
    
    
    
}
