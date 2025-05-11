package common.programs.recurssion;

public class SumOfdigits {

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
