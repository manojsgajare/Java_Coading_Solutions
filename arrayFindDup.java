import java.util.Arrays;

public class arrayFindDup {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 4, 7, 2, 8, 4, 7, 3, 0 };
        int result[] = new int[arr.length];
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            result[i] = arr[i];
            if (arr[i + 1] == result[i]) {

                arr[i] = result[i];
                System.out.println(arr[i]);
            }

        }

    }
}
