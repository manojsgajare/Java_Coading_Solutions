public class maxInArray {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int max = 0;

        int m = arr[0].length; // row
        int n = arr[1].length; // column

        int i = 0, j;

        int result[] = new int[m];

        while (i < m) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            result[i] = max;
            max = 0;
            i++;
        }

        for (int k = 0; k < result.length - 1; k++) {
            System.out.println(result[i]);
        }
    }
}
