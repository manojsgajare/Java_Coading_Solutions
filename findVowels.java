public class findVowels {
    public static void main(String[] args) {

    char vowels []= {'a','e','i','o','u'};

    String str ="aman is very good boy";
    char strr[] = str.toCharArray();

    int count = 0;
    for (int i=0; i<vowels.length; i++){
        for (int j = 0; j < strr.length; j++) {
            if(vowels[i] == strr[j]){
                count++;
            }
        }
    }
    System.out.println(count);

    }
    
}
