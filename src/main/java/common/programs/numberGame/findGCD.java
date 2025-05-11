package common.programs.numberGame;

public class findGCD {
    public static void main(String[] args) {
        int a = 21;
        int b = 55;

        while(a != 0 && b != 0){
            if(a == b){
                System.out.println("GCD: "+a);
                return;
            }
            else if(a < b){
                b = b-a;
            }
            else if(b < a){
                a = a-b;
            }
        }
    }
}
