public class productSubArray {
    public static void main(String[] args) {
        int arrr[] = {1,2,3,4};
        // subArr[] = {24, 12, 8, 6}; Create this array

        // while(arr[i]){

        // }
            int n =3;

        int count[]=new int[n];
        for (int i=0; i<4;i++){
            for (int j=1; j<4;j++){
                count[i] =  arrr[i+1] * arrr[j];
            }
           System.out.print(count[i] + " ");
        }
    }
}
