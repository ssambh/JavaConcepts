package common.programs.binarySearch;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {8,9,10,1,2,3,4,5,6,7};
        System.out.println(findInRotatedSorted(arr, 7));
    }

    public static int findInRotatedSorted(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            //we return the mid if the target matches
            if(arr[mid] == target){
                return mid;
            }
            /* We need to find which side is sorted and then perform
            the check on the sorted side to eliminate one side
             */
            else if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(arr[end] >= arr[mid]){
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
