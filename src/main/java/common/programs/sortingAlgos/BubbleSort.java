package common.programs.sortingAlgos;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k : arr){
            System.out.println(k);
        }
    }
}
