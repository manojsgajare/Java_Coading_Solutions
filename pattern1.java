public class pattern1 {
    public static void main(String[] args) {
        
        int n = 5;
        for (int rows = 0; rows <= n; rows++) {
            for (int columns = n ; columns > rows; columns--)
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}
