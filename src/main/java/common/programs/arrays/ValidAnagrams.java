package common.programs.arrays;

public class ValidAnagrams {
    public static void main(String[] args) {

    }

    public static boolean isValidAnagrams(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        int total = 0;
        for(int c : arr){
            total += c;
            if(total != 0){
                return false;
            }
        }
        return true;
    }
}
