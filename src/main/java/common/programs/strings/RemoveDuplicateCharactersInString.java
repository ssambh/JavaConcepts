package common.programs.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharactersInString {

    public static void main(String args[]){
            String s = "Sarang";
        System.out.println(usingArrayList(s));
        System.out.println(usingMap(s));
        System.out.println(usingStringBuilder(s));
    }

    //Using an array list
    public static String usingArrayList(String s){
        String s1 = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(list.contains(s1.charAt(i))){
                continue;
            }
            else{
                list.add(s1.charAt(i));
            }
        }
        s1 = list.toString();
        return s1;
    }

    //Using hashmap
    public static String usingMap(String s){
        String s1 = s.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            if(map.containsKey(c)){
                continue;
            }
            else{
                map.put(c,1);
            }
        }
        s1 = "";
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            s1 = s1 + e.getKey();
        }
        return s1;
    }

    //Using StringBuilder
    public static String usingStringBuilder(String s){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))==-1){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
