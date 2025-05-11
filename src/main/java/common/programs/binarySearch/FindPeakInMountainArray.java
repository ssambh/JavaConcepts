package common.programs.binarySearch;

public class FindPeakInMountainArray {

    public static void findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        //running the loop until start = end = mid, and that is the answer.
        while(start < end){
            mid = start + (end - start)/2;
            //mid+1 might be the potential answer, that's why start = mid+1
            if(arr[mid]  < arr[mid+1]){
                start = mid + 1;
            }
            //this may be our potential answer, that's why end = mid.
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
        }
        System.out.println("The peak is: " + mid);
    }
}
