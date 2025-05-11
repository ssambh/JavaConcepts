package common.programs.strings;

public class ReverseTheOrderOfWords {

    public static void main(String[] args) {
        String s = "This is a new String";
        reverseOrderOfWords(s);
    }

    public static void reverseOrderOfWords(String s) {
        String[] arr = s.split(" ");
        String s1 = "";
        for(int i = arr.length-1; i >=0; i--){
            s1 += arr[i] + " ";
        }
        System.out.println(s1);
    }
}
