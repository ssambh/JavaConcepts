package common.programs.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "Saranggs";
        char[] arr =  nestedLoop(s);
        for (char c : arr) {
            if (c != 0)
                System.out.println(c);
        }

        ArrayList<Character> list = mapChar(s);
        System.out.println(list);
    }
    //Using n^2 time complexity as we are using nested loops
    public static char[] nestedLoop(String s){
        int count = 0;
        //this step removes the possibility of ignoring characters based on upper or lower case.
        String s1 = s.toLowerCase();
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length()-1; i++){
            for(int j = i+1; j < s.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    ch[count] = s.charAt(i);
                    count++;
                }
            }
        }
        return ch;
    }

    //using O(1) time complexity as we are using hashmap
    public static ArrayList<Character> mapChar(String s){
        String s1 = s.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : s1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}