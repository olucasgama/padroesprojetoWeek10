package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarProdutos(){
        Departamento departamento = new Departamento();
        departamento.cadastrarProduto("Meia", "Lupo", "Roupas");
        departamento.cadastrarProduto("Camiseta", "Adidas", "Roupas");
        departamento.cadastrarProduto("Tenis", "Nike", "Calçados");
        departamento.cadastrarProduto("Sandália", "Havaianas", "Calçados");

        List<String> lista = Arrays.asList(
            "Produto{Nome='Meia', Marca='Lupo', Categoria=Roupas}",
                "Produto{Nome='Camiseta', Marca='Adidas', Categoria=Roupas}",
                "Produto{Nome='Tenis', Marca='Nike', Categoria=Calçados}",
                "Produto{Nome='Sandália', Marca='Havaianas', Categoria=Calçados}"
        );

        assertEquals(lista, departamento.getProdutos());
    }

    @Test
    void deveRetornarCategorias(){
        Departamento departamento = new Departamento();
        departamento.cadastrarProduto("Meia", "Lupo", "Roupas");
        departamento.cadastrarProduto("Camiseta", "Adidas", "Roupas");
        departamento.cadastrarProduto("Tenis", "Nike", "Calçados");
        departamento.cadastrarProduto("Sandália", "Havaianas", "Calçados");

        assertEquals(2, CategoriaFactory.totalCategorias());
    }

}