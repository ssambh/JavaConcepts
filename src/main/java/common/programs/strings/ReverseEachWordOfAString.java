package common.programs.strings;
//Reverse every word of a string without changing the order placement of the words.
public class ReverseEachWordOfAString {
    public static void main(String[] args) {
        String s = "This is my personal repository";
        usingArray(s);
    }

    public static void usingArray(String s) {
        String[] arr = s.split(" ");
        String s1 = "";
        for(int i = 0; i < arr.length; i++){
            String str = "";
            for(int j = arr[i].length()-1; j >= 0; j--){
                str += arr[i].charAt(j);
            }
            s1 += str + " ";
        }
        System.out.println(s1);
        s1 = s1.trim();
        System.out.println(s1.length());
    }

}
