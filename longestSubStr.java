import java.util.ArrayList;

// Count the longest substring without repetiting characters
public class longestSubStr {

    static void checkStr(String str) {
        ArrayList<Character> visited = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (visited.contains(str.charAt(j))) {
                    result.addAll(visited);

                    if (count < result.size()) {
                        count = result.size();
                        System.out.println("length is-- " + count + " String is-- " + result);   
                    }
                    visited.clear();
                    result.clear();
                    break;
                } else {
                    visited.add(str.charAt(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "jajhkjku";
        checkStr(s);
    }
}
