package common.programs.sortingAlgos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]) {
        int[] arr = {3,2,65,4,5,33,7,1,0};
        int[] arr1 = mergeSort(arr);
        for(int i : arr1){
            System.out.println(i);
        }
        }

        public static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
        }

        public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];

         int i = 0;
         int j = 0;
         int k = 0;
         while(i < left.length && j < right.length){
             if(left[i] < right[j]){
                 mix[k] = left[i];
                 i++;
             }
             else{
                 mix[k] = right[j];
                 j++;
             }
             k++;
         }
         if(i == left.length){
             while(j != right.length){
                 mix[k] = right[j];
                 j++;
                 k++;
             }
         }
         else if(j == right.length){
             mix[k] = left[i];
             i++;
             k++;
         }
         return mix;
        }
    }
