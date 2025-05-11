package common.programs.recurssion;

public class Factorial {
    public static void main(String[] args){
        int n = 10;
        int answer;
        answer = factorial(n);
        System.out.println("The factorial of n is " + answer);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        n = n * factorial(n-1);
        return n;
    }
}
