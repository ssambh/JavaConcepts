package common.programs.bitwise;
/*
Performing OR operation on 2 numbers only gives true when either or both the numbers are true
1. OR operation of any number with 1 will give 1.
 */
public class OrOperator {
    public static void main(String[] args) {
        int num = 21;
        int i = 4;
        System.out.println(setIthBit(num,i));
    }

    public static int setIthBit(int num, int i){
        //Shifting 1 to ith place and doing OR operation with ith bit of given number
        int answer = num | (1 << i-1);

        return answer;
    }
}
