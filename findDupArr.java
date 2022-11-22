import java.util.Arrays;

public class findDupArr {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 4, 45, 36, 8, 0 };
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
