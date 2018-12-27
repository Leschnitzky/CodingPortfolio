package CTCI;

import java.util.stream.Collectors;

public class StringAnagrams {
    public static boolean isAnagram(String first,String second){
        return (first.chars().
                mapToObj((c)-> (char) c)
                .sorted().collect(Collectors.toList())
                .equals( second.chars().mapToObj((c)->(char) c).sorted().collect(Collectors.toList())));
    }

    public static void main(String[] args) {
        String test1S1 = "abcd";
        String test1S2 = "bacd"; // true
        String test2S1 = "ABcd";
        String test2S2 = "bAcd"; // false
        String test3S1 = "BAAAAC";
        String test3S2 = "AACABA"; // true

        System.out.println(isAnagram(test1S1,test1S2));
        System.out.println(isAnagram(test2S1,test2S2));
        System.out.println(isAnagram(test3S1,test3S2));
    }
}
