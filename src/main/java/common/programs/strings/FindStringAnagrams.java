package common.programs.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindStringAnagrams {
    public static void main(String[] args){
        String s = "sarang";
        String s1 = "garans";
        System.out.println(usingMap(s,s1));
        System.out.println(usingArrays(s,s1));
    }

    //Using hashmap
    public static boolean usingMap(String s, String s2){
        if(s.length() != s2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(Character c : s2.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()%2 !=0){
                return false;
            }
        }
        return true;
    }

    //Using arrays
    public static boolean usingArrays(String s, String s2){

        if(s.length() != s2.length()){
            return false;
        }
        char[] arr = new char[s.length()];
        arr = s.toCharArray();

        char[] arr2 = new char[s2.length()];
        arr2 = s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
