package common.programs.numberGame;

public class PerfectNumber {
    public static void main(String[] args){
        int n = 6;
        int count = 0;

        for(int i = 1; i <= n/2; i++){
            if(n%i==0){
                count += i;
            }
        }
        if(count == n){
            System.out.println(n+" is a perfect integer");
        }
        else{
            System.out.println(n+" is not a perfect integer");
        }
    }
}
