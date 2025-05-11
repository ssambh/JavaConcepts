package common.programs.binarySearch;

public class FindClosestNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,13,19};
        int target = 4;
        System.out.println(closestNumber(arr,target));
    }

    public static int closestNumber(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        int ans1 = 0;
        int ans2 = 0;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            // This makes sure that the smaller number(potential answer) than the target is stored in a variable
            else if(arr[mid] < target){
                ans1 = mid;
                start = mid+1;
            }
            //This makes sure that a larger number(potential answer) than the target gets stored in a variable
            else if(arr[mid] > target){

                ans2 = mid;
                end = mid-1;
            }
        }
        //coomparing our 2 answers and returning
        if(Math.abs(target-arr[ans1]) < Math.abs(target-arr[ans2])){
            return arr[ans1];
        }

        else if(Math.abs(target-arr[ans1]) > Math.abs(target-arr[ans2])){
            return arr[ans2];
        }
        else{
            return Math.max(arr[ans1],arr[ans2]);
        }
    }
}
