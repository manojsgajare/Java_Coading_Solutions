
public class equalSum {

    static void findSum(int arr[], int ln) {

        int i, j, k, left, right;

        for (k = 0; k < ln; k++) {

            left = 0;
            for (i = 0; i < k; i++) {
                left += arr[i];
            }

            right = 0;
            for (j = k+1; j < ln; j++) {
                right += arr[j];
            }

            if (left == right) {
                
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int ln = arr.length-1;
        findSum(arr, ln);
    }
}









