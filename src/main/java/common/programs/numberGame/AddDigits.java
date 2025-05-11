package common.programs.numberGame;

public class AddDigits {
    public static void addDigits(int a){
        int num = 0;
        while(a != 0){
            num += a%10;
            a = a/10;
            if(a==0 && num/10!=0){
                a = num;
                num = 0;
            }
        }
        System.out.println(num);
    }
}
