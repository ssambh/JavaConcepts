package common.programs.binarySearch;

public class FindInInfiniteArray {

    public static void findInInfiniteArray(int[] arr, int k){
        int start = 0;
        int end = 1;

        while(k > arr[end]){
            int temp = end +1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(k == arr[mid]){
                System.out.println(mid);
                return;
            }
            else if (k > arr[mid]){
                start = mid +1;
            }
            else if (k < arr[mid]){
                end = mid -1;
            }
        }
        System.out.println(-1);
    }
}
