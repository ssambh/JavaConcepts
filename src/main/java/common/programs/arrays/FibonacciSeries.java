package common.programs.arrays;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n = sc.nextInt();
        usingArrays(n);
    }

    public static void usingArrays(int n){
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            if(i < 2){
                arr[i] = i;
                continue;
            }
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
