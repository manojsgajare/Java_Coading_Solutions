public class primeSwapArray {
    public static boolean prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int A[] = { 14, 12, 23, 4, 10, 7, 10, 12, 9, 14, 2, 14 };
        int n = 12;
        for (int i = 0; i < n; i = i + 2) {
            if (prime(A[i] + A[i + 1])) {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
