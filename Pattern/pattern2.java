package Pattern;
public class pattern2 {

    /*
     * 1
     * 01
     * 101
     * 0101
     * 10101
     */

    public static void main(String[] args) {
        int i, j;
        int n = 5;

        for (i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (j = 1; j <= i; j++) {
                    if (j % 2 == 1) {
                        System.out.print("1"
                                + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
            } else {
                for (j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }

                }
            }

            System.out.println();
        }

    }

}
