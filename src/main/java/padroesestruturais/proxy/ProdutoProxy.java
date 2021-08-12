package padroesestruturais.proxy;

import java.util.List;

public class ProdutoProxy implements IProduto {

    private Produto produto;
    private Integer id;

    public ProdutoProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosProduto() {
        if (this.produto == null) {
            this.produto = new Produto(this.id);
        }
        return this.produto.obterDadosProduto();
    }

    @Override
    public List<Double> obterPrecos(Terminal terminal) {
        if (!terminal.isLigado()) {
            throw new IllegalArgumentException("Terminal de consulta desligado");
        }
        if (this.produto == null) {
            this.produto = new Produto(this.id);
        }
        return this.produto.obterPrecos(terminal);
    }
}
