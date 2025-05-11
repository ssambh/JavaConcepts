package runtimeException;

public class ArrayIndexOutOBound {
    public static void main(String[] args) {
        int[] arr = {3,2,4,3,1};
        arrayIndexOutOfBound(arr);

    }

    public static void arrayIndexOutOfBound(int[] arr){
        for(int i = 0; i <= arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
