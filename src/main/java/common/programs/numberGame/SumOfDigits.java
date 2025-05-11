package common.programs.numberGame;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of it's digits");
        int n = sc.nextInt();
        int total = 0;
        while(n != 0){
            total = total + n % 10;
            n = n/10;
        }
        System.out.println("sum of digits is: " + total);
    }
}
