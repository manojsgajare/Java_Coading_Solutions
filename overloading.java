public class overloading {

    // Method overLoading

    static int main(int x, int y) {
        return x - y;
    }

    static int min(int x, int y) {

        int z;
        z = x * y;
        return z;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(min(x, y));
        System.out.println(min(x, y));
    }
}
