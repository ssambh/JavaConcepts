package common.programs.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    //Find the first non-repeating character in the string and return it's index, else return -1;
    public static void main(String[] args) {
        String s = "SgaraSrnng";
        System.out.println(findFirstNonRepeatingNumber(s));
        System.out.println(usingMaps(s));
    }
    //Using String and nested loop
    public static int findFirstNonRepeatingNumber(String s) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            for (j = 0; j < s.length(); j++) {
                if(i==j && i==s.length()-1){
                    return i;
                }
                if(i==j){
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    break;
                }
            }
            if (j == s.length()) {
                return i;
            }
        }
        return -1;
    }

    //Using map
    public static int usingMaps(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
