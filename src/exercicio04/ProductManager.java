package exercicio04;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Crie uma classe Product com atributos name e price.
 * Crie uma classe ProductManager com uma lista estática de produtos
 * e métodos estáticos para adicionar, remover e listar todos os produtos.
 */
public class ProductManager {
    public static List<Product> products = new ArrayList<>();

    public ProductManager() {}

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void removeProduct(Product product) {
        products.remove(product);
    }

    public static void listAllProducts() {
        for (Product product : products) {
            System.out.println("\nName: " + product.getName());
            System.out.println("Price: " + product.getPrice());
        }
    }
}
