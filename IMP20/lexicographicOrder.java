package IMP20;

public class lexicographicOrder {

    static void lexic(char ch[]) {

        char first ='a';
        
        char[] chr = new char[ch.length-1];

        for (int i = 0; i < ch.length-1; i++) {

            if (first == ch[i]) {

                chr[i] = first;

                first++;
            }
        }

        for (int i = 0; i <= chr.length-1; i++) {
            System.out.println(chr[i]);
        }
    }

    public static void main(String[] args) {

        char arr[] = { 'd', 'b', 'c', 'd' };

        lexic(arr);
    }

}
