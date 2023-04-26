
package com.company.tests;

import com.mycompany.entities.Conta;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
       
    @Test
    public void testDepositarDinheiroCorretamente(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        assertTrue(conta.depositar(50));
    }
    
    @Test
    public void testDepositarQuantidadeNegativa(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        assertFalse(conta.depositar(-50));
    }
    
    @Test
    public void testSacarMaisQueSaldo(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertFalse(conta.sacar(60));
    }
    
    @Test
    public void testSacarValorNegativo(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertFalse(conta.sacar(-10));
    }
    
    @Test
    public void testSacarCorretamente(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertTrue(conta.sacar(50));
    }
    
    @Test
    public void testPagarOnlineValorMaiorQueSaldo(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertFalse(conta.pagarOnline(60));
    }
    
    @Test
    public void testPagarOnlineCorretamente(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertTrue(conta.pagarOnline(50));
    }
    
    @Test
    public void testPagarOnlineValorZero(){
        Titular titular1 = new Titular("Felipe", "Rua Qualquer");
        Conta conta = new Conta(titular1);
        
        conta.depositar(50);
        
        assertFalse(conta.pagarOnline(-50));
    }
    
}
