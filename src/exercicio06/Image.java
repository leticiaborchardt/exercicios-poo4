package exercicio06;

/**
 * 6. Crie uma interface Printable com um método print().
 * Implemente esta interface em duas classes diferentes, Document e Image,
 * onde cada uma imprime uma mensagem específica.
 */
public class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Imprimindo imagem.");
    }
}
