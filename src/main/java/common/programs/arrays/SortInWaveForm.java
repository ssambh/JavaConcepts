package common.programs.arrays;

import java.util.Arrays;

public class SortInWaveForm {

    public static void sortInWaveForm(int[] arr){
        //Sort the array first
        Arrays.sort(arr);
        //then swap elements in pairs of 2
        for(int i = 0; i < arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }
        for(int j : arr){
            System.out.print(j + " ");
        }
    }
}
