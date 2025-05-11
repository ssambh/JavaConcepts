package common.programs.arrays;

public class FindMissingNumberiInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i = Integer.MAX_VALUE;

        if(arr[i] != 1){
            System.out.println(1);
            return;
        }
        while(i < arr.length-1){
            if(arr[i+1] - arr[i] > 1){
                System.out.println(arr[i]+1);
                return;
            }
            i++;
        }
        System.out.println("No Missing number");

    }
}
