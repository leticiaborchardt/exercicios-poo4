package exercicio08;

/**
 * 8. Crie uma interface Sortable com um método sort(int[] array).
 * Implemente esta interface em duas classes diferentes, BubbleSort e QuickSort,
 * que realizam a ordenação de um array usando os respectivos algoritmos.
 */
public class BubbleSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        int aux = 0;
        int i = 0;

        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }
}
