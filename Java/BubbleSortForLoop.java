import java.util.Arrays;

public class BubbleSortForLoop {
    public static void bubbleSort(int[] unsortedArray) {
        for (int sortedIndex = (unsortedArray.length - 1); sortedIndex >= 0; sortedIndex--) {
            for (int arrayIndex = 0; arrayIndex < unsortedArray.length-1; arrayIndex++) {
                if (unsortedArray[arrayIndex] > unsortedArray[arrayIndex+1]) {
                    swap(unsortedArray, arrayIndex+1, arrayIndex);
                }
            }
        }
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void swap(int[] givenArray, int indexOfSmaller, int indexOfLarger) {
        int temp = givenArray[indexOfSmaller];
        givenArray[indexOfSmaller] = givenArray[indexOfLarger];
        givenArray[indexOfLarger] = temp;
    }

    public static void main(String[] args) {
        int[] toBeSorted = {0, 1, 0, 1, 2, 3, 4, 2, 4, 3};
        bubbleSort(toBeSorted);
    }
}
