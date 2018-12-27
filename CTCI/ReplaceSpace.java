package CTCI;

public class ReplaceSpace {
    public static String replaceSpace(String s){
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        while(index != stringBuilder.length() ){
            if(stringBuilder.charAt(index) == ' '){
                stringBuilder =  new StringBuilder(
                        stringBuilder.substring(0,index)
                                + "%20"+
                        stringBuilder.substring(index+1,stringBuilder.length()));
                continue;
            }
            index++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String test1 = "test a"; // test%20a
        String test2 = " test"; // %20test
        String test3 = "test "; // test%20
        String test4 = "a     b"; // a%20%20%20%20%20b
        String test5 = "    ab"; // %20%20%20%20ab

        System.out.println(replaceSpace(test1));
        System.out.println(replaceSpace(test2));
        System.out.println(replaceSpace(test3));
        System.out.println(replaceSpace(test4));
        System.out.println(replaceSpace(test5));
    }
}
