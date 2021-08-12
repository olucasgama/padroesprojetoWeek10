package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Produto implements IProduto {

    private Integer id;
    private String nome;
    private Double preco;

    public Produto(Integer id) {
        this.id = id;
        Produto objeto = ProdutoDAO.getProduto(id);
        this.nome = objeto.nome;
        this.preco = objeto.preco;
    }

    public Produto(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosProduto() {
        return Arrays.asList(this.nome);
    }

    @Override
    public List<Double> obterPrecos(Terminal terminal) {
        return Arrays.asList(this.preco);
    }
}
