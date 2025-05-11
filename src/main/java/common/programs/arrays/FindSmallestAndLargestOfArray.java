package common.programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestAndLargestOfArray {

    public static void main(String[] args){
        System.out.println("Input an array of numbers");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        usingLoop(arr);
        sortAndFind(arr);
    }

    //Looping through the array and replacing the value in smallest and largest value variables
    public static void usingLoop(int[] arr){
        int smallest = arr[0];
        int largest = arr[0];

        for(int i : arr){
            if(i < smallest){
                smallest = i;
            }
            else if (i > largest){
                largest = i;
            }
        }
        System.out.println("Smallest number in the array is: "+smallest);
        System.out.println("Largest number in the array is: "+largest);
    }

    //Sorting the array first and fetching the first and last value.
    public static void sortAndFind(int[] arr){
        Arrays.sort(arr);
        int smallest = arr[0];
        int largest = arr[arr.length-1];

        System.out.println("Smallest number in the array is: "+smallest);
        System.out.println("Largest number in the array is: "+largest);
    }

}
