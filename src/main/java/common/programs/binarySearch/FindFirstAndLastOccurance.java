package common.programs.binarySearch;

public class FindFirstAndLastOccurance {

    public static void findFirstAndLastOccurance(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int first = -1;
        int last = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == k){
                first = mid;
                end = mid-1;
            }
            else if(k < arr[mid]){
                end = mid - 1;
            }
            else if(k > arr[mid]){
                start = mid + 1;
            }
        }
        start = 0;
        end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == k){
                last = mid;
                start = mid + 1;
            }
            else if(k < arr[mid]){
                end = mid - 1;
            }
            else if(k > arr[mid]){
                start = mid + 1;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
