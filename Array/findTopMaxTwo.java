package Array;

public class findTopMaxTwo {

    public static void printMaxTwo(int arr[]) {

        int max1 = arr[0];
        int max2 = arr[1];

        if (max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            int x = arr[i];
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }

        System.out.println("The top two maximum numbers are: " + max1 + " and " + max2);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3 };

        printMaxTwo(arr);
    }

}
