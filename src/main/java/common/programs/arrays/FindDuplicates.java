package common.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args){
        int[] arr = {3,54,12,65,34,7,3,99,54,54};
        System.out.println(usingArraysSort(arr));
        System.out.println(usingMap(arr));
    }
    //Using Arrays.sort()
    public static ArrayList usingArraysSort(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }

    //Using hashmap
    public static ArrayList<Integer> usingMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}
