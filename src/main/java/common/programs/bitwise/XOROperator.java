package common.programs.bitwise;
/*
XOR will only return true in "if and only if" condition, meaning only if either of the bits is true.
1. XOR done with itself gives "0"
2. XOR done with 1 gives the number's complement
3. XOR done with 0 gives the number itself
 */
public class XOROperator {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,7,6,3};
        System.out.println(uniqueNumber(arr));
    }
/*
Performing XOR of a number with itself returns 0, therefore only the non-repeated number will be left as the answer.
**This will only work if there is only 1 non-repeated number in the array.
 */
    public static int uniqueNumber(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
