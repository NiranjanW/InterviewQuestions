package solutions.problem1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class duplicate {
    public static void main(String[] args) {
    // boolean result = findDups("foo");
    // System.out.println(result);

    String str = "foo";
    System.out.println(setChar(str));

    // System.out.println(process)

}

//Java 14
// static String process (int input){
//     return switch(input){
//         case 1 -> "first",
//         case 2 -> "second",
//         default ->"whatever"
//     }
// }

public static Boolean findDups(String str) {
    boolean[] result = new boolean [128];
    for (int i = 0; i < str.length(); i++) {
        int val = str.charAt(i);
        if (result[val]){
            return false;
        }
        result[val] = true;
    }
    return true;
}

static String setChar ( String str ){

    Set<Character> resultSet = new HashSet<Character>();
    for(int i = 0; i < str.length(); i++) {
        resultSet.add(str.charAt(i));
    }
    return resultSet.toString();
}


public static List<Character> convertToString (String str){
    
    List<Character> result = str
        .chars()
        .mapToObj(e -> (char)e)
        .collect(Collectors.toList());

    return result;
}
void replaceSpaces(char[] str , int length) {
    int spaceCount = 0 ,newlength , i = 0 ;
    for (i =0 ; i <length ; i++) {
        if (str[i] == ' '){
            spaceCount++;

        }
    }

}
// public static String padSpace(String str){
//     String new_str = new String();
//     for (int i = 0; i < str.length(); i++){
        
//         if(str[i] == ' ' ){
            
//         }


//     }

//     return result;
// }
}


