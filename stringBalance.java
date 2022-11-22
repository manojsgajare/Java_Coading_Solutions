import java.util.HashMap;

public class stringBalance {
    public static void main(String[] args) {
        String str = "aabbccdccbbaa";
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hmn = new HashMap<>();

        for (int i = 0; i < ch.length / 2; i++) {
            if (hm.containsKey(ch[i])) {
                int count = hm.get(ch[i]);
                hm.put(ch[i], count + 1);
            } else {
                hm.put(ch[i], 1);
            }
        }
        System.out.println(hm);

        if (ch.length % 2 == 0) {
            for (int i = (ch.length / 2); i < ch.length; i++) {
                if (hmn.containsKey(ch[i])) {
                    int count = hmn.get(ch[i]);
                    hmn.put(ch[i], count + 1);
                } else {
                    hmn.put(ch[i], 1);
                }
            }
            System.out.println(hmn);
        } else {
            for (int i = (ch.length / 2) + 1; i < ch.length; i++) {
                if (hmn.containsKey(ch[i])) {
                    int count = hmn.get(ch[i]);
                    hmn.put(ch[i], count + 1);
                } else {
                    hmn.put(ch[i], 1);
                }
            }
            System.out.println(hmn);
        }

        if (hm.equals(hmn)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

}
