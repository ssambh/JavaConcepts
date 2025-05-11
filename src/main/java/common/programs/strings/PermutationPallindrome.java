package common.programs.strings;

import java.util.HashMap;
import java.util.Map;

// Find if the given string can be converted into a pallindrome string
public class PermutationPallindrome {
    public static void main(String[] args) {

    }

    public static boolean pallindrome(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }

        }

        if(map.size() == 1){
            return true;
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
           //if characters with odd frequencies are more than 1, then we cannot convert the string to pallindrome
            if(e.getValue() % 2 == 1){
               count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
