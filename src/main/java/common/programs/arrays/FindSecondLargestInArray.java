package common.programs.arrays;

import java.util.Arrays;
//Find the second largest element in an array
public class FindSecondLargestInArray {
    public static void main(String [] args){
        int[] arr = {4,3,-3,11,100,98,99,100,5};
        System.out.println("Second largest number in the array is "+usingArraysSort(arr));
        System.out.println("Second largest number in the array is "+findDifference(arr));
    }

    //Using Arrays.sort() function
    public static int usingArraysSort(int[] arr){
        Arrays.sort(arr);
        int num=0;
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i] > arr[i-1]){
                num = arr[i-1];
                break;
            }
        }
        return num;
    }

    //search by finding difference between largest and second-largest value
    public static int findDifference(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int max2 = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max2 && arr[j] < max){
                max2 = arr[j];
            }
        }
        return max2;
    }
}
