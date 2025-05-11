package common.programs.arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,2,2,0,2,0,1,2,0};

        int start = 0;
        int end = arr.length-1;
        int c = 0;

        while(c <= end){
            int temp = 0;
            // we move c pointer after swapping because we know we have already sorted the elements from the beginning.
            if(arr[c] == 0){
                temp = arr[start];
                arr[start] = arr[c];
                arr[c] = temp;
                c++;
                start++;
            }
            //we don't move the c pointer because we don't know what number from the end is being swapped.
            else if(arr[c] == 2){
                temp = arr[end];
                arr[end] = arr[c];
                arr[c] = temp;
                end--;
            }
            else{
                c++;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
