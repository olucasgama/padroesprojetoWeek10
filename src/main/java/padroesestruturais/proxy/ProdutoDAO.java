package padroesestruturais.proxy;

import java.util.HashMap;

public class ProdutoDAO {

    private static HashMap<Integer, Produto> produtos = new HashMap<>();

    public static Produto getProduto(Integer id) {
        return produtos.get(id);
    }

    public static void insereProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
    }
}
