package CTCI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UniqueString {

    // Function to check if all of the characters in the String are unique
    public static boolean uniqueChecker(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        s.chars().mapToObj(c->(char) c).forEach(
                (c) -> {
                    if(map.containsKey(c)){
                        map.put(c,map.get(c) + 1);
                    } else{
                        map.put(c,1);
                    }
                }
        );

        return (map.values().stream().filter((x)-> x > 1).count() == 0);
    }

    public static String removeDuplicates(String s){
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        while(index != stringBuilder.length()){
            Character c = stringBuilder.charAt(index);
            if(stringBuilder.substring(0,index).contains(c.toString())){
                stringBuilder.deleteCharAt(index);
                continue;
            } else{
                index++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        String test1 = "A"; //true
        String test1v2 = "ABA"; // false
        String test1v3 = "ABCDAEF"; // false
        String test1v4 = "AaBbCcDd"; // true
        String test1v5 = "!ANORMaLWorD!"; //false

        String test2 = "AAB"; //AB
        String test2v1 = "ABBAAAAA"; //AB
        String test2v2 = "ACBCBCCBCGDF"; //ACBGDF
        String test2v3 = "ABCDFDCBA"; // ABCDF
        String test2v4 = "AABBCCDDEEFF"; //ABCDEF

        System.out.println( uniqueChecker(test1));
        System.out.println( uniqueChecker(test1v2));
        System.out.println( uniqueChecker(test1v3));
        System.out.println( uniqueChecker(test1v4));
        System.out.println( uniqueChecker(test1v5));

        System.out.println( removeDuplicates(test2));
        System.out.println( removeDuplicates(test2v1));
        System.out.println( removeDuplicates(test2v2));
        System.out.println( removeDuplicates(test2v3));
        System.out.println( removeDuplicates(test2v4));

    }
}
