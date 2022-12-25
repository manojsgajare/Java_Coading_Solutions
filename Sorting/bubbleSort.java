package Sorting;

public class bubbleSort {

    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // time complexity = O(n^2)

    public static void main(String[] args) {

        int arr[] = { 7, 8, 5, 7, 3, 8 };

        for (int i = 0; i < arr.length - 1; i++) { // first loop for counter
            for (int j = 0; j < arr.length - i - 1; j++) { // arr.length-i-1 = we put sorted or largest element at last

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray(arr);
    }

}
