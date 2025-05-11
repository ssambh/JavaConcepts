package common.programs.strings;

import java.util.ArrayList;

public class ReverseAString {

    public static void main(String[] args){
        String s = "Sarang";
        System.out.println(usingStringBuilder(s));
        System.out.println(usingArrayList(s));
        System.out.println(usingStringConcatination(s));
    }

    //Reverse a string using string builder
    public static String usingStringBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return sb.toString();
    }

    //Using ArrayList
    public static String usingArrayList(String s){
        ArrayList<Character> al = new ArrayList<>();
        for(int i = s.length()-1; i>=0; i--){
            al.add(s.charAt(i));
        }
        return al.toString();
    }

    //Using String concatenation
    public static String usingStringConcatination(String s){
        String s1 = "";
        for(int i = s.length()-1; i >=0; i--){
            s1 = s1+s.charAt(i);
        }
        return s1;
    }
}
