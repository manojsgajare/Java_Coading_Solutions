import java.util.Scanner;

public class binarySearch {

    static void searchNumber(int arr[], int n, int num) {

        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == num) {
                System.out.println("Value is found at index : " + mid);
                break;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            }
        }

        if (low > high) {
            System.out.println("Value is not found in array: ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();

        searchNumber(arr, n, num);
        sc.close();
    }

}
