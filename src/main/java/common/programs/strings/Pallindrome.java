package common.programs.strings;

public class Pallindrome {

    public static void main(String[] args){
        String s = "addas";
        System.out.println(reverseLoop(s));
        System.out.println(stringBuilder(s));
    }

    //using reverse loop
    public static boolean reverseLoop(String s){
        String s1 = "";

        for(int i = s.length()-1; i >=0; i--){
            s1 = s1 + s.charAt(i);
        }

        if(s1.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }

    //Using StringBuilder
    public static boolean stringBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
