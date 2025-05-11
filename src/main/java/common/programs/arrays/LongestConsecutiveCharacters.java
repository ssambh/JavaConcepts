package common.programs.arrays;

public class LongestConsecutiveCharacters {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'a', 'b','c','c','c','c', 'd', 'e', 'e','e','e','e','e'};
        method2(arr);
    }
    public static void method1(char[] arr){
        int max = 1;
        int count = 1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(count > max){
                    max = count;
                }
                continue;
            }
            count = 1;
        }
        System.out.println(max);
    }

    public static void method2(char[] arr){
        int count = 1;
        int max = 1;

        for(int i = 0; i < arr.length-1; i++){
            count = 1;
            while(i < arr.length-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }

            if(count > max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
