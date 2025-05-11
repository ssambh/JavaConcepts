package common.programs.arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        //This is the formula for finding the total sum of N numbers
        int total = n * (n+1)/2;

        for(int i = 0; i < nums.length; i++){
            total -= nums[i];
        }
        return total;
    }
}
