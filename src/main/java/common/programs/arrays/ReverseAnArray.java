package common.programs.arrays;

public class ReverseAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        usingAnotherArray(arr);
        System.out.println();
        usingSwapping(arr);

    }

    public static void usingAnotherArray(int[] arr){
        int[] arr1 = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            arr1[arr.length-i-1] = arr[i];
        }

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

    public static void usingSwapping(int[] arr){
        int j = arr.length-1;
        int temp = 0;
        int i = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
