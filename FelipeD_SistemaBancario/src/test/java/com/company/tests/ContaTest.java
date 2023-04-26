
package com.company.tests;

import com.mycompany.entities.Conta;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    
    private Titular titular;
    private Conta conta;
    
    @BeforeEach
    public void inicializando(){
        titular = new Titular("Felipe", "Rua Qualquer");
        conta = new Conta(titular);
        conta.depositar(50);
    }
       
    @Test
    public void testPassarAoDepositarDinheiroCorretamente(){
        assertTrue(conta.depositar(50));
    }
    
    @Test
    public void testFalharAoDepositarQuantidadeNegativa(){
        assertFalse(conta.depositar(-50));
    }
    
    @Test
    public void testFalharAoSacarMaisQueSaldo(){
        assertFalse(conta.sacar(60));
    }
    
    @Test
    public void testFalharAoSacarValorNegativo(){
        assertFalse(conta.sacar(-10));
    }
    
    @Test
    public void testPassarAoSacarCorretamente(){
        assertTrue(conta.sacar(50));
    }
    
    @Test
    public void testFalharAoPagarOnlineComValorMaiorQueSaldo(){
        assertFalse(conta.pagarOnline(60));
    }
    
    @Test
    public void testPassarAoPagarOnlineCorretamente(){
        assertTrue(conta.pagarOnline(50));
    }
    
    @Test
    public void testFalharAoPagarOnlineValorNegativo(){
        assertFalse(conta.pagarOnline(-50));
    }
    
}
