package padroesestruturais.proxy;

import java.util.List;

public interface IProduto {

    List<String> obterDadosProduto();
    List<Double> obterPrecos(Terminal terminal);
}
