import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapBasic {

    // country(key), population(value)
    public static void main(String[] args) {
        // Insertion
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 130);
        hm.put("US", 30);
        hm.put("Japan", 32642);

        System.out.println(hm);
        // O/P:- {Japan=32642, US=30, India=130}

        // Update
        hm.put("India", 7565);
        System.out.println(hm); // Value will be updated -- India=7565}

        // Search
        if (hm.containsKey("India")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get value from the key
        System.out.println(hm.get("India")); // 7565 -- If key not present then NULL will be present

        // For loop implementation for hashmap
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            /*
             * Japan
             * 32642
             * US
             * 30
             * India
             * 7565
             */
       
        }
        System.out.println();

        // Set option for getting keys
        Set<String> keys = hm.keySet();
        for (String key : keys){
            System.out.println(key + " "+ hm.get(key));
        }

        System.out.println("*********");

        // How to remove
        hm.remove("US");
        System.out.println(hm);
    }
}
