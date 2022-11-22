// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.*;

// import javax.print.DocFlavor.STRING;

// class findDup {
//     // Using Hashmap

//     static void method(String str) {
//         HashMap<String, Integer> hm = new HashMap<>();

//         String strr[] = str.split(" ");

//         for (String tempStr : strr) {
//             if (hm.get(tempStr) != null) {
//                 hm.put(tempStr, hm.get(tempStr + 1));
//             } else {
//                 hm.put(tempStr, 1);
//             }
//         }
//         Iterator<String> tempStr = hm.keySet().iterator();

//         while (tempStr.hasNext()) {
//             String temp = tempStr.next();
//             if (hm.get(temp) > 1) {
//                 System.out.println(temp + "\t" + hm.get(temp));
//             }

//         }
//     }

//     public static void main(String argu[]) {
//         String str = "beautiful beach";

//         method(str);
//     }

// }

// // char arr[] = str.toCharArray();

// // for (int i=0; i<str.length(); i++){
// // for (int j=i+1; j<str.length(); j++){

// // if(arr[i] == arr[j]){
// // System.out.println(arr[j] + " ");
// // }
// // }
// // }

// /*
//  * String str = "beautiful beach";
//  * char[] carray = str.toCharArray();
//  * System.out.println("The string is:" + str);
//  * System.out.print("Duplicate Characters in above string are: ");
//  * for (int i = 0; i < str.length(); i++) {
//  * for (int j = i + 1; j < str.length(); j++) {
//  * if (carray[i] == carray[j]) {
//  * System.out.print(carray[j] + " ");
//  * break;
//  * }
//  * }
//  * }
//  * 
//  */