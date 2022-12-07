
public class overloading {

    // Method overLoading

    static int main(int x, int y) {
        return x - y;
    }

    static int main(int x, int y,int b) {

        int z;
        z = x * y;
        return z;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int c = 30;
        System.out.println(main(x, y));
        System.out.println(main(x, y, c));
    }
}
