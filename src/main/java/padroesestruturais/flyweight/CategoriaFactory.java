package padroesestruturais.flyweight;

import java.util.HashMap;

public class CategoriaFactory {

    private static HashMap<String, Categoria> categorias = new HashMap<>();

    public static Categoria obterCategorias(String nome) {
        Categoria categoria = categorias.get(nome);
        if (categoria == null) {
            categoria = new Categoria(nome);
            categorias.put(nome, categoria);
        }
        return categoria;
    }

    public static int totalCategorias() {
        return categorias.size();
    }
}
