package common.programs.arrays;

// Write a program to return the array of indices from the given array, which adds up to the target
public class SumOfTwo {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] arr = twoSum(nums,target);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        boolean breakFlag = false;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    breakFlag = true;
                    break;
                }
            }
            if(breakFlag == true){
                break;
            }
        }
        return arr;
    }
}
