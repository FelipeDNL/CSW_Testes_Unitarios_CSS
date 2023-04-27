
package com.company.tests;

import com.mycompany.entities.Historico;
import com.mycompany.entities.Operacao;
import com.mycompany.entities.Titular;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistoricoTest {
    
    private Titular titular;
    private Historico historico;
    private Operacao operacao1, operacao2;
    private List<Operacao> listaOperacao;
    
    @BeforeEach
    public void Inicializar(){
        titular = new Titular("Fulano", "12345678901");
        historico = new Historico(titular);
        operacao1 = new Operacao("Depósito", 100.0);
        operacao2 = new Operacao("Saque", 50.0);    
    }
    
    @Test
    public void testAdicionarOperacao() {
        historico.adicionarOperacao(operacao1);
        listaOperacao = historico.buscarPorOperacao("Depósito");
        assertEquals(listaOperacao.size(), 1);
        assertEquals(listaOperacao.get(0), operacao1);
    }

    @Test
    public void testBuscarPorOperacao() {
        historico.adicionarOperacao(operacao1);
        historico.adicionarOperacao(operacao2);
        listaOperacao = historico.buscarPorOperacao("Saque");
        assertEquals(listaOperacao.size(), 1);
        assertEquals(listaOperacao.get(0), operacao2);
    }

    @Test
    public void testBuscarPorValor() {
        historico.adicionarOperacao(operacao1);
        historico.adicionarOperacao(operacao2);
        listaOperacao = historico.buscarPorValor(50.0);
        assertEquals(listaOperacao.size(), 1);
        assertEquals(listaOperacao.get(0), operacao2);
    }

    
    

}
