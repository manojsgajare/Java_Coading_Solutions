package Pattern;

public class oneZeroPyramid {

    void main() {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        oneZeroPyramid one = new oneZeroPyramid();

        one.main();

    }

}
