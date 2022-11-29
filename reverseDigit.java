public class reverseDigit {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev);

        // Here num%10 gives last digit as output every at every iteration
        // and num/10 removes last digit from the number
    }

}
