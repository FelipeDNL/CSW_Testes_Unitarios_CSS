
package com.company.tests;

import com.mycompany.entities.ContaSalario;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaSalarioTest {
    
    private Titular titular;
    private ContaSalario conta;
    
    @BeforeEach
    public void inicializando(){
        titular = new Titular("Lopes", "Rua Qualquer");
        conta = new ContaSalario(titular);
        conta.depositar(50);
    }
    
    @Test
    public void testFalharAoTentarPagarOnline(){
        assertFalse(conta.pagarOnline(50));
    }
}
