package exercicio07;

/**
 * 7. Crie uma interface Speakable com um método speak().
 * Implemente esta interface em duas classes diferentes, Dog e Cat,
 * onde cada uma imprime o som que o animal faz.
 */
public class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("au au 🐶");
    }
}
