package Collections;

import java.util.ArrayList;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("project");
        list.add("hp");
        list.add("static");

        removeString(list);
    }

    static void removeString(ArrayList<String> list) {

        for (String string : list) {
            if (string.equals("hp")) {
                list.remove(string);
            }
        }

        System.out.println(list);
    }

}
