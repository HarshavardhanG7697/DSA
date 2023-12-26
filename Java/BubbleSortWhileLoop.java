import java.util.Arrays;

public class BubbleSortWhileLoop {
    public static void bubbleSort(int[] unsortedArray) {
        int arrayLegth = unsortedArray.length - 1;
        boolean swapped;

        do {
            swapped = false;

            for (int index = 0; index < arrayLegth; index++) {
                if (unsortedArray[index] > unsortedArray[index+1]) {
                    swap(unsortedArray, index+1, index);
                    swapped = true;
                } else {
                    swapped = false;
                }
            }
            arrayLegth--;
        } while (!swapped && arrayLegth >= 0);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void swap(int[] givenArray, int indexOfSmaller, int indexOfLarger) {
        int temp = givenArray[indexOfSmaller];
        givenArray[indexOfSmaller] = givenArray[indexOfLarger];
        givenArray[indexOfLarger] = temp;
    }

    public static void main(String[] args) {
        int[] toBeSorted = {20, -15, 7, 35, 1, -22, 55, -343, 243, -23, 999};
        bubbleSort(toBeSorted);
    }
}
