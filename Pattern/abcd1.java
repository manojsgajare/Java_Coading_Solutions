package Pattern;

public class abcd1 {

    // Print all alphabets
    public static void main(String[] args) {

        Character first = 'A';
        Character last = 'Z';

        for (int i = 1; i <= last - 'A' + 1; i++) {
            System.out.print(first + " ");
            first++;
        }

    }

}
