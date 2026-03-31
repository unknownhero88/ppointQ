package Day05;

import java.util.Arrays;

public class BubbleSort {

    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                }
            }
        }

       return swapCount;
    }

    public static void main(String[] args) {
        int[] nums   = {64, 34, 25, 12, 22, 11, 90};
        int[] scores = {45, 92, 38, 71, 85};
        int[] sorted = {1, 2, 3, 4, 5};

        int swapCount1=bubbleSort(nums);
        bubbleSort(scores);
        int swapCount2=bubbleSort(sorted);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(scores));
        System.out.println("Swaps for nums: " + swapCount1);
        System.out.println("Swaps for "+Arrays.toString(sorted)+": " + swapCount2);
    }
}