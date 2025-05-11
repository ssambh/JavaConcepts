package common.programs.numberGame;

import java.util.Scanner;

public class PrimeNotPrime {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        findPrime(a);
    }

    public static void findPrime(int a){
        for(int i = 2; i <= a/2; i++){
            if(a%i==0){
                System.out.println("This number is not prime");
                return;
            }
        }
        System.out.print("This number is prime");
    }
}
