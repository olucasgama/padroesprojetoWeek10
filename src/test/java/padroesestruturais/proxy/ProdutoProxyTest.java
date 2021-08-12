package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoProxyTest {

    @BeforeEach
    void setUp() {
        ProdutoDAO.insereProduto(new Produto(1, "Meia", 20.0));
        ProdutoDAO.insereProduto(new Produto(2, "Camiseta", 30.0));
    }

    @Test
    void retornaDadosProduto() {
        ProdutoProxy proxy = new ProdutoProxy(1);
        assertEquals(Arrays.asList("Meia"), proxy.obterDadosProduto());
    }

    @Test
    void retornaPrecosProduto() {
        Terminal terminal = new Terminal(true);
        ProdutoProxy produtoProxy = new ProdutoProxy(1);
        assertEquals(Arrays.asList(20.0), produtoProxy.obterPrecos(terminal));
    }

    @Test
    void retornaExcessao() {
        try {
            Terminal terminal = new Terminal(false);
            ProdutoProxy produtoProxy = new ProdutoProxy(2);
            produtoProxy.obterPrecos(terminal);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Terminal de consulta desligado", e.getMessage());
        }
    }
}