package CTCI;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueString {
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

    public static void main(String[] args){
        String test = "A"; //true
        String test2 = "ABA"; // false
        String test3 = "ABCDAEF"; // false
        String test4 = "AaBbCcDd"; // true
        String test5 = "!ANORMaLWorD!"; //false

        System.out.println( uniqueChecker(test));
        System.out.println( uniqueChecker(test2));
        System.out.println( uniqueChecker(test3));
        System.out.println( uniqueChecker(test4));
        System.out.println( uniqueChecker(test5));

    }
}
