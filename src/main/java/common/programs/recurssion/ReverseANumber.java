package common.programs.recurssion;

public class ReverseANumber {
    static int sum = 0;
    static int n = 1234;
    public static void main(String[] args) {

        reverseANumber(n);
        System.out.println(sum);
    }

    public static void reverseANumber(int n){
        if(n == 0){
            return;
        }
        int rem = n  % 10;
        sum = sum * 10 + rem;
        reverseANumber(n/10);
    }

    public static boolean isPallindrome(int num){
        if(n == sum){
            return true;
        }
        return false;
    }
}
