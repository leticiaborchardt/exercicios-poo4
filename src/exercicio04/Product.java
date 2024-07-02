package exercicio04;

/**
 * 4. Crie uma classe Product com atributos name e price.
 * Crie uma classe ProductManager com uma lista estática de produtos
 * e métodos estáticos para adicionar, remover e listar todos os produtos.
 */
public class Product {
    private String name;
    private double price;

    public Product () {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
