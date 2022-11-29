import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Search for target number
        int target = 5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    System.out.print("Number found at index  arr[" + i + "][" + j + "] = " + arr[i][j]);
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("No such element");
        }

        sc.close();
    }

}
