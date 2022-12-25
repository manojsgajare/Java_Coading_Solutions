package Sorting;

public class selectionSort {

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Selection Sort
    // time complexity = O(n^2)
    public static void main(String[] args) {

        // 0 1 2 3 4 5 6
        int arr[] = new int[] { 7, 5, 7, 4, 3, 7, 8 };

        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallest] > arr[j]) {

                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        print(arr);
    }
}
