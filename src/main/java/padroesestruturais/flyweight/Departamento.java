package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private List<Produto> produtos = new ArrayList<>();


    public void cadastrarProduto(String nome, String marca, String nomeCategoria) {
        Categoria categoria = CategoriaFactory.obterCategorias(nomeCategoria);
        Produto produto = new Produto(nome, marca, categoria);
        produtos.add(produto);
    }

    public List<String> getProdutos() {
        List<String> obter =  new ArrayList<>();
        for ( Produto produto : this.produtos ) {
            obter.add(produto.toString());
        }
        return obter;
    }
}
