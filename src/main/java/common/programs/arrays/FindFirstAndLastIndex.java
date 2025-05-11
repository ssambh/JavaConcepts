package common.programs.arrays;
//Find the first and last index of a given number in the given array
public class FindFirstAndLastIndex {

    public static void findFirstAndLastIndex(int[] arr, int k) {
        int first = -1;
        int last = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k && first == -1){
                first = i;
            }
            else if(arr[i] == k){
                last = i;
            }
        }
        System.out.println("First index: "+ first +"\n" +"Last Index: "+ last);
    }
}
