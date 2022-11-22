public class pattern4 {

    /*
     * 
    //     * # * # * 
    //     # * # *
    //     * # *
    //     # *
    //     *
     */
    public static void main(String[] args) {
        int n=6;

        for (int i=1; i<n; i++){
            if (i%2==0){
                for (int j=i; j<n; j++){
                    if (j%2==1){
                     System.out.print("*" + " ");
                    }else{
                     System.out.print("#" + " ");
                    }
                 }
            }else{
                for (int j=i; j<n; j++){
                    if (j%2==1){
                     System.out.print("*" + " ");
                    }else{
                     System.out.print("#" + " ");
                    }
                 }
            }
            System.out.println();
        }
    }
    
}
