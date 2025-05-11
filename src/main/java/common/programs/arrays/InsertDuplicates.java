package common.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertDuplicates {
/*
Given an array consisting of N integers and an integer K, the task is to insert an adjacent K for every occurrence of it in the original sequence
and then truncate the array to the original length using an O(1) auxiliary space.
 */
    public static void insertDuplicates(int[] arr, int a) {
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == a){
                int j = arr.length-1;
                while(j > i+1){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[i+1] = arr[i];
                i++;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
