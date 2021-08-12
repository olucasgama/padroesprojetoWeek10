package padroesestruturais.flyweight;

public class Produto {

    private String nome;
    private String marca;
    private Categoria categoria;

    public Produto(String nome, String marca, Categoria categoria) {
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String toString() {
        return "Produto{" +
                "Nome='" + nome + '\'' +
                ", Marca='" + marca + '\'' +
                ", Categoria=" + categoria.getNome() +
                '}';
    }
}
