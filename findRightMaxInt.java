

public class findRightMaxInt {

    // O/P = 17 5 2

    static void findRightMax(int arr[], int ln) {

        int i, j, k, left, right;

        for (k = 0; k < ln; k++) {

            left = 0;
            for (i = 0; i < k; i++) {
                left += arr[i];
            }

            right = 0;
            for (j = k + 1; j < ln; j++) {
                right += arr[j];
            }

            if (left == right) {

                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int ln = arr.length - 1;
        findRightMax(arr, ln);
    }
}
