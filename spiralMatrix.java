import java.util.Scanner;

public class spiralMatrix {

    // Print the array in spiral pattern

    static void spiralPrint(int matrix[][], int t){

       int r1, r2, c2, c1;
       
       if(matrix.length == 0){
        return;
       }
       
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int matrix[][] = new int [t][t];

        for (int i=0;i<t;i++){
            for(int j=0; j<t;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralPrint(matrix, t);
    }

    
}
