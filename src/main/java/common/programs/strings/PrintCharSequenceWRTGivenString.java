package common.programs.strings;

import java.util.Arrays;
import java.util.List;

public class PrintCharSequenceWRTGivenString {
    public static void main(String[] args) {
        String s = "a3b2c4";
        char[] arr = s.toCharArray();
        for(int i = 0; i<s.length()-1; i++)
        {
            for(int j = 0; j<Character.getNumericValue(arr[i+1]); j++){
                System.out.print(arr[i]);
            }
            i += 1;
        }
    }
}
