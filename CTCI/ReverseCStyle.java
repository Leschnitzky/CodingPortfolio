package CTCI;

public class ReverseCStyle {
    public static String reverse(String cStyle){
        StringBuilder stringBuilder = new StringBuilder(cStyle);
        return stringBuilder.append('\\').reverse().deleteCharAt(2).toString();
    }

    public static void main(String[] args){
        String test = "abcd\\%";

        System.out.println(reverse(test));
    }
}
