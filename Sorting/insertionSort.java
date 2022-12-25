package Sorting;

public class insertionSort {

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // insertion sort

    public static void main(String[] args) {

        int arr[] = new int[] { 7, 5, 9, 3, 9, 2, 0 };

        for (int i = 0; i < arr.length - 1; i++) {  // counter

            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        insertionSort is = new insertionSort();
        is.print(arr);

    }
}
