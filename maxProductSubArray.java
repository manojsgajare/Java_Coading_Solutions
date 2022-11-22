public class maxProductSubArray {

    static void maxProduct(int thisArr[], int size) {

        int product[] = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                product[i] = thisArr[i] * thisArr[j];
                System.out.println(product[i]);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 4, 6, 8, 9 };
        int n = arr.length;

        maxProduct(arr, n);
    }
}
