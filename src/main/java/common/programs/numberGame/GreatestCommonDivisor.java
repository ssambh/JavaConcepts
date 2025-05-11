package common.programs.numberGame;

public class GreatestCommonDivisor {
    public static void main(String[] args){

        int a = 99;
        int b = 81;
        int min;
        if(a-b<0){
            min = a;
        }
        else{
            min = b;
        }
        int largestFactor=0;

        for(int i = 1; i <= min/2; i++){
            if(a%i==0 && b%i==0){
                largestFactor = i;
            }
        }
        System.out.println(largestFactor + " is the Largest common divisor of "+a+ " and "+b);
    }
}
