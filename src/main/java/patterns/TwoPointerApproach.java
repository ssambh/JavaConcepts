package patterns;

public class TwoPointerApproach {
    /*
    This approach solves the following problems:
    1. Pallindrome String
    2. Reverse an array
    3. Find the indexes in the sorted array that sums up to the given number
    4. Move all the zeroes to the right of the array
    5. Find any 3 indexes that add up to the given sum
    6. Sort Color
     */
    public static void main(String[] args){
        String s = "madam";
        int[] arr = {1,1,0,2};
        sortColors(arr);
    }

    public static void pallindrome(String s){
        int p1 = 0;
        int p2 = s.length()-1;

        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                System.err.println("Not Pallindrome");
                return;
            }
            p1++;
            p2--;
        }
        System.out.println("Pallindrome String");
    }
//Reverse an integer array using the 2 pointer approach
    public static void reverseArray(int arr[]){
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
//Find 2 indexes in the sorted array that sums up to the given number
    public static void givenSum(int arr[], int t){
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1 < p2){
            if(arr[p1] + arr[p2] < t){
                p1++;
            }
            else if(arr[p1] + arr[p2] > t){
                p2--;
            }
            else{
                System.out.println(p1 + ", " + p2);
                return;
            }
        }
        System.err.println("Sum not found");
    }
//Move all zeros to the right of the array
    public static void moveAllZeroes(int arr[]){
        int p1 = 0;
        int p2 = 0;
        //running the loop until the p2 pointer reaches the end of the array
        while(p2 != arr.length-1){
            //if p2 is at a non-zero number, just swap p1 and p2 and increment both pointers
            if(arr[p2] != 0){
                arr[p1] = arr[p2];
                p1++;
            }
            p2++;
        }
        //add zeroes to the remaining indexes of the array using the p1 pointer
        while(p1 < arr.length){
            arr[p1] = 0;
            p1++;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
//Find the 3 indexes that add up to the given sum
    public static void find3Sum(int arr[], int t){

        for(int i = 0; i < arr.length-2; i++){
            int p1 = i+1;
            int p2 = arr.length-1;
            while(p1 < p2){
                if(arr[i] + arr[p1] + arr[p2] > t){
                    p2--;
                }
                else if(arr[i] + arr[p1] + arr[p2] < t){
                    p1++;
                }
                else{
                    System.out.println(i + ", " + p1 + ", " + p2);
                    return;
                }
            }
        }
    }
//sort the array in the below format: [0,1,2]
    public static void sortColors(int arr[]){
        int current = 0;
        int start = 0;
        int end = arr.length-1;

        while(current <= end){
            int temp;
            if(arr[current] == 0){
                temp = arr[start];
                arr[start] = arr[current];
                arr[current] = temp;
                start++;
                current++;
            }
            else if(arr[current] == 2){
                temp = arr[end];
                arr[end] = arr[current];
                arr[current] = temp;
                end--;
            }
            else{
                current++;
            }

        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
