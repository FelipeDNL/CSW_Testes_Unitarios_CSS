
package com.company.tests;

import com.mycompany.entities.ContaCorrente;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaCorrenteTest {
    
    private Titular titular;
    private ContaCorrente conta;
    
    @BeforeEach
    public void inicializando(){
        titular = new Titular("Davi", "Rua Qualquer");
        conta = new ContaCorrente(titular);
        conta.depositar(50);
    }
    
    @Test
    public void testPassarAoSacarValorMenorQueLimite(){
        assertTrue(conta.sacar(50));
    }
    
    @Test
    public void testFalharAoSacarValorMaiorQueLimite(){
        assertFalse(conta.sacar(450));
    }
    
    @Test
    public void testFalharAoSacarValorNegativo(){
        assertFalse(conta.sacar(-50));
    }
    
    @Test
    public void testPassarAoPagarOnlineValorMenorQueLimite(){
        assertTrue(conta.pagarOnline(50));
    }
    
    @Test
    public void testFalharAoPagarOnlineValorMaiorQueLimite(){
        assertFalse(conta.pagarOnline(351));
    }
    
    @Test
    public void testFalharAoPagarOnlineValorNegativo(){
        assertFalse(conta.pagarOnline(-10));
    }
}
