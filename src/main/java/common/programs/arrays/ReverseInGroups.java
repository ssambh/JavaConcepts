package common.programs.arrays;

public class ReverseInGroups {

    public static void reverseInGroups(int[] arr, int k){
        int[] arr1 = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i=i+k){
            int start = i;
            int end = Math.min(i+k-1, arr.length-1);

            for(int j = end; j >= start; j--){
                arr1[count] = arr[j];
                count++;
            }
        }
        for(int h : arr1){
            System.out.print(h + " ");
        }
    }
}
