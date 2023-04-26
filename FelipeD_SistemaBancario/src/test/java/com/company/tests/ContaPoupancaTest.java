
package com.company.tests;

import com.mycompany.entities.ContaPoupanca;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {
    
    private Titular titular;
    private ContaPoupanca conta;
    
    @BeforeEach
    public void inicializando(){
        titular = new Titular("Nascimento", "Rua Qualquer");
        conta = new ContaPoupanca(titular);
        conta.depositar(50);
    }
    
    @Test
    public void testPassarAoSacarValorMenorQueSaldoIncluindoTaxa(){
        assertTrue(conta.sacar(40.20f));
    }
    
    @Test
    public void testFalharAoSacarValorMaiorQueSaldoIncluindoTaxa(){
        assertFalse(conta.sacar(60));
    }
    
    @Test
    public void testFalharAoSacarValorNegativo(){
        assertFalse(conta.sacar(-10));
    }
    
}
