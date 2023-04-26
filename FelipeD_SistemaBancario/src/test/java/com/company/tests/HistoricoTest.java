
package com.company.tests;

import com.mycompany.entities.Historico;
import com.mycompany.entities.Titular;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistoricoTest {
    
    private Titular titular;
    private Historico historico;
    
    @BeforeEach
    public void inicializando(){
        titular = new Titular("Davi", "Rua Qualquer");
        historico = new Historico(titular);
    }
    
    @Test
    public void testPassarAoAdicionarOperacao(){
        
    }
    
    @Test
    public void testFalharAoAdicionarOperacao(){
        
    }
}
