
import java.util.Scanner;

class transposeMatrix {

    /*
     * Given a 2D integer array matrix, return the transpose of matrix.
     * 
     * The transpose of a matrix is the matrix flipped over its main diagonal,
     * switching the matrix's row and column indices.
     * 
     * Example 1:
     * 
     * Input: matrix = [[1,2,3]
     *                  ,[4,5,6],
     *                  [7,8,9]]
     * Output: [[1,4,7],
     *          [2,5,8],
     *          [3,6,9]]
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = sc.nextInt();
        System.out.println("Enter column number: ");
        int column = sc.nextInt();
        int mat[][] = new int[row][column];
        System.out.println("enter matrix values: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();

        transpose(mat);
    }

    public static void transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int new_matrix[][] = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                new_matrix[j][i] = matrix[i][j]; // interchange the positions

                System.out.print(new_matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}