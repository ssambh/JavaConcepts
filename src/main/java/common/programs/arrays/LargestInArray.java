package common.programs.arrays;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Input the integer array of size 10");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i : arr){
            if(i > largest){
                largest = i;
            }
        }
        System.out.println("The largest number in the array is " + largest);
    }
}
