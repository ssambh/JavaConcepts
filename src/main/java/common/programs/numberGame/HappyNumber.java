package common.programs.numberGame;

public class HappyNumber {
    public static void main(String[] args) {
        int a =8;
        int original = a;

        int sum = 0;
        while (a != 1) {
            while(a != 0){
                int digit = a%10;
                sum += digit*digit;
                a = a/10;
            }
            a = sum;
            sum = 0;
            if(a == original){
                System.err.println("Not a Happy Number");
                return;
            }
        }
        System.out.println("Happy Number");
    }
}
