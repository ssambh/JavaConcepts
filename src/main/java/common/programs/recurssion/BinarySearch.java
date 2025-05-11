package common.programs.recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,12,19,22,29,33,78};
        int target = 78;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start, mid-1);

    }
}
