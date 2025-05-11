package common.programs.numberGame;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Input the second number: ");
        int number2 = sc.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After swap:");
        System.out.println("First number: "+number1);
        System.out.println("Second number: "+number2);
    }



}
