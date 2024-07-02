package exercicio08;

/**
 * 8. Crie uma interface Sortable com um método sort(int[] array).
 * Implemente esta interface em duas classes diferentes, BubbleSort e QuickSort,
 * que realizam a ordenação de um array usando os respectivos algoritmos.
 */
public class QuickSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(array, startIndex, endIndex);

            quickSort(array, startIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, endIndex);
        }

        return array;
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex];
        int smallerElementIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (array[currentIndex] < pivot) {
                smallerElementIndex++;

                int temp = array[smallerElementIndex];
                array[smallerElementIndex] = array[currentIndex];
                array[currentIndex] = temp;
            }
        }

        int temp = array[smallerElementIndex + 1];
        array[smallerElementIndex + 1] = array[endIndex];
        array[endIndex] = temp;

        return smallerElementIndex + 1;
    }
}
