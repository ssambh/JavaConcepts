package common.programs.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,6,5,4,1,22,76,34,8};
        int k = 3;

        System.out.println(findTheKthLargestElement(nums,k));
    }

    public static int findTheKthLargestElement(int[] nums, int k){
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            if(i < k){
                p.offer(nums[i]);
            }
            else if(nums[i] > p.peek()){
                p.poll();
                p.offer(nums[i]);
            }
        }
        return p.peek();
    }
}
