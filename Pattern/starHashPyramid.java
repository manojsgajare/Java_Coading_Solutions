package Pattern;

public class starHashPyramid {

    void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starHashPyramid st = new starHashPyramid();
        int n = 5;
        st.printStar(n);
    }
}
