import java.util.Scanner;

public class bubbleSort2 {

    // Printing
    public static void printThis(int array[]) {
        System.out.println("Sorted array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Sorting
    public static void sortThis(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printThis(arr);
    }

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter array element: ");
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sortThis(x);
        sc.close();
    }
}
