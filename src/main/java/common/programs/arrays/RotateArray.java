package common.programs.arrays;

public class RotateArray {

    public static void rotateArray(int[] arr1, int k){
        for(int i = 0; i < k; i++){
            int temp = arr1[0];
            for(int j = 0; j < arr1.length-1; j++){
                arr1[j] = arr1[j+1];
            }
            arr1[arr1.length-1] = temp;
        }
        for(int j : arr1){
            System.out.print(j + " ");
        }
    }
}
