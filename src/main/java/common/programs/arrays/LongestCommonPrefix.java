package common.programs.arrays;

import java.util.Arrays;

//find the longest common prefix from the Strings of a given string array.
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"Sarang", "Sak", "Saran"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        l.usingSubstring(arr);
    }

    public static void usingNestedLoops(String[] arr){
        Arrays.sort(arr);
        int max = 0;

        for(int i = 0; i < arr[0].length(); i++){
            int j;
            for(j=1; j < arr.length; j++){
                if(arr[0].charAt(i) != arr[j].charAt(i)){
                    break;
                }
            }
            if(j==arr.length){
                max += 1;
            }
            else{
                break;
            }
        }
        if(max == 0){
            System.out.println("");
        }
        else{
            System.out.println(arr[0].substring(0,max));
        }
    }

    public static void anotherMethod(String[] arr){
        String prefix = "";
        for(int i = 0; i < arr[0].length(); i++){
            for(int j = 1; j < arr.length; j++){

                if(i == arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)){
                    System.out.println(prefix);
                    return;
                }
            }
            prefix += arr[0].charAt(i);
        }
    }

    public void usingSubstring(String[] arr){
        String prefix = arr[0];

        for(int i = 1; i < arr.length; i++){
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
