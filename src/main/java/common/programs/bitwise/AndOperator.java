package common.programs.bitwise;

/*
1. AND operator only gives 1 when both the bits are one.
2. Any number AND with 1 gives the first bit of the original number, hence the answer would be either 1 or 0.
 */

public class AndOperator {
    public static void main(String[] args) {
        int num = 2;
        int i = 4;
        System.out.println(powerOfNumber(num, 4));
    }

    /*
    Identify if the number is odd or even.
    If we do an ANd operation with 1, we would get 1 or 0. As the first bit tells us if the number
    is odd or even, we can conclude based on the answer.
     */
    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }

    /*
    Identify what is the ith bit of the given number.
    If we just do an AND operation of that bit with 1, we would get either 0 as the answer or 1.
     */
    public static int ithBit(int num, int i){
        //we have to "left shift" the 1 bit i-1 times so 1 lands on the ith bit and we can do AND of 1 and ith bit of the given number
        //Shifting 1 to ith place is called masking
        int answer = num &(1<<i-1);
        if(answer==0){
            return answer;
        }
        else{
            return 1;
        }
    }
    //reset the ith bit of the given number to 0 if it is 1 and leave as is if it's 0
    public static int resetIthBit(int num, int i){

        int n = 1 << i-1;
        //If we just complement n, we will get 0 in place of 1 and 1 in place of 0 bits.
        n = ~n;
        //if we just do the AND of this number with the given number, then the ith bit of that number will be reset to 0;
        int answer = num & n;
        return answer;
    }

    //return the number of bits in the given decimal number
    public static int returnNumberOfBits(int n){
        int count = 0;

        while(n != 0){
            n = n >> 1;
            count++;
        }
        return count;
    }
    // Magic number is just base 5 number.
    public static int findIthMagicNumber(int i){
        int base = 5;
        int answer = 0;
        while(i != 0){
            //finding the last bit and multiplying it with 5. Later incrementing base by power of 5.
            int last = i & 1;
            //right shifting i to we can again get the last bit in the next iteration.
            i = i >> 1;
            //multiplying the last bit with power of 5 and adding it to the answer(magic number)
            answer += last * base;
            //increasing base with the power of 5.
            base *= 5;
        }
        return answer;
    }

    //Find if the number is a power of 2
    public static boolean isPowerOfTwoMethod1(int num){
        if(num == 0){
            return false;
        }
        //if we AND n with n-1, and it returns 0 that means n is even.
        /* ex:
        1   0   0   0 <- this is power of 2 as there is only 1 bit
      & 0   1   1   1
      ----------------
        0   0   0   0 - this means it's a power of 2.
         */
        return (num & num-1) == 0;
    }

    public static boolean isPowerOfTwoMethod2(int num){
        int count = 0;
        while(num != 0){
            //counting the number of 1 bits. If it's more than 1 then it's not a power of 2.
            if((num & 1) == 1){
                count ++;
            }
            num = num >> 1;
        }
        return count == 1;
    }

    //calculate the given power of the given number
    public static int powerOfNumber(int n, int pow){
        int result = 1;
        while(pow != 0){
            if((pow&1)==1){
                result *= n;
            }
            n *= n;
            pow >>= 1;
        }
        return result;
    }
}
