package common.programs.strings;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String s1 = "sarang";
        String s2 = "sambharia";
        swapWithoutVariable(s1,s2);
        swapWithVariable(s1,s2);
    }

    public static void swapWithoutVariable(String s1, String s2) {
        s1 = s1 + s2;
        s2 = s1.substring(0,(s1.length()-s2.length()));
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void swapWithVariable(String s1, String s2){
        String extra = s1;
        s1 = s2;
        s2 = extra;
        System.out.println(s1);
        System.out.println(s2);
    }
}
