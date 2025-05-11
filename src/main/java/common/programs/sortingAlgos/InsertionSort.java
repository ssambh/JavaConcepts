package common.programs.sortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,7,21,7,45,213,1,3,2};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int a = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > a){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = a;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
