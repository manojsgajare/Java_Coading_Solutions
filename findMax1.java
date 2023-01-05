public class findMax1 {
// Return the max element index position
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 7, 8, 5, 3, 7, 9 };

        int max = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }

            
        }
        System.out.print(max);
    }

}
