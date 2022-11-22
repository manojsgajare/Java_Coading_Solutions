public class leapYear {
    public static void main(String[] args) {
        int year  = 2020;

        if (year % 400 == 0){
            System.out.println("Leap Year condition 1");
        }else if(year%4==0 && year%100 !=0){
            System.out.println("Leap year condition 2");
        }else{
            System.out.println("Not leap year");
        }
    }
} 
