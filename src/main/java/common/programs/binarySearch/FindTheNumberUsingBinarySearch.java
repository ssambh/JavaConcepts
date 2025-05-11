package common.programs.binarySearch;

import common.programs.Practice;

import java.util.Arrays;

//Find the given target number in the given array, else return -1
public class FindTheNumberUsingBinarySearch extends Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 0;

        System.out.println();

    }
//Using regular binary search
    public static int findNumber(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        if(target > arr[arr.length-1] || target < arr[0]){
            return -1;
        }
        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
        }
        return mid;
    }
    //using recurssion
    public static int BinarySearch(int arr[], int left, int right, int key) {

        if (right >= left) {

            int MidElement = left + (right - left) / 2;
            if (arr[MidElement] == key) // If the required element is found at the middle index
                return MidElement;

            if (key < arr[MidElement]) // If the required element is smaller than the element at the middle index  It can only be present in the left subarray
                return BinarySearch(arr, left, MidElement - 1, key);

            return BinarySearch(arr, MidElement + 1, right, key); // else, it would be present in the right subarray
        }
        return -1; // Element not found, and the array can not be further divided.
    }
}

