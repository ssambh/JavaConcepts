package common.programs.bitwise;

public class OtherOperations {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(negativeOfANumber(n)));
    }

    //Calculate the -ve of the given number - just take 2s complement of the number
    public static int negativeOfANumber(int n){
        n = ~n;
        n += 1;
        return n;
    }
}
