package Pattern;
public class pattern5 {
    /*
     * *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i <rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.err.println("");
        }

        // for (int i = 0; i < rows; i++) // outer loop for number of rows(n)
        // {
        // for (int j = - i; j > 1; j--) // inner loop for spaces
        // {
        // System.out.print(" "); // print space
        // }
        // }

    }

}
