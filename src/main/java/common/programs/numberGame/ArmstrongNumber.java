package common.programs.numberGame;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int dup = n;
        int total = 0;
        int count = 0;
        int a = n;
        while(a!=0){
            a = a/10;
            count++;
        }
        int b;
        while(n != 0){
            b = n%10;
            n = n/10;
            int m = 1;
            for(int i = 0; i < count; i ++){
                m = m * b;
            }
            total = total + m;
        }
        System.out.println("Total: " + total);
        if(total == dup){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}
