package common.programs.arrays;
//Find the subarray and the maximum sum of the subarray from the given array.
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-4,3,1,-6,9};
        maxSubarrayComparison(arr);
    }
    //This will solve in O(n^2)
    public static void maxSubarrayComparison(int[] arr){
        int max = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length-1; i++){
            sum = arr[i];


            for(int j = i+1; j < arr.length; j++){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(start + ", " + end);
    }
    //This will solve in O(n)
    public static void kadanesAlgo(int[] arr){
        int i = 0;
        int sum = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        while(i < arr.length) {
            sum += arr[i];
            //if sum = 0 that means we are starting again from that index.
            if(sum == 0){
                start = i;
            }
            if(sum > max){
                end = i;
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
            i++;
        }
        System.out.println("Maximum Sum: "+max);
        System.out.println(start + ", " + end);
    }

}
