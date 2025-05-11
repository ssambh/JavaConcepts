package common.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Find 3 indices in the array that add up to the given target number
public class SumOfThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 34, 5, 0, 13, 22};
        int target = 12;
    }
    //As we are sorting the array, the returned indices will we different from the original array.
    public static void sumOfThree(int[] arr, int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            int p1 = i+1;
            int p2 = arr.length-1;
            while(p1 < p2){
                int result = arr[i] + arr[p1] + arr[p2];
                if(result == target){
                    System.out.println("Index 1: " + i + "\n" + "Index 2: " + p1 + "\n" + "Index 3: " + p2);
                    return;
                }
                else if(result < target){
                    p1++;
                }
                else if(result > target){
                    p2--;
                }
            }
        }
        System.out.println("Indices not found, Target sum not available");
    }

    //Return all the triplets from the given list that adds to 0
    public static void returnAllTriplets(int[] arr){
        ArrayList<Integer> list;
        List<ArrayList<Integer>> mainList = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            list = new ArrayList<>();
            int a = i+1;
            int b = arr.length-1;
            while(a < b){
                int result = arr[i] + arr[a] + arr[b];
                if(result == 0){
                    list.add(arr[i]);
                    list.add(arr[a]);
                    list.add(arr[b]);
                    Collections.sort(list);
                    if(!mainList.contains(list)){
                        mainList.add(list);
                    }
                    break;
                }
                if(result < 0){
                    a++;
                }
                else if(result > 0){
                    b--;
                }
            }
        }
        System.out.println(mainList);
    }
}
