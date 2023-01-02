package Pattern;

public class alphabetPyramid {

    public static void main(String[] args) {

        int n = 5;
        int alphabet = 65;
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}
