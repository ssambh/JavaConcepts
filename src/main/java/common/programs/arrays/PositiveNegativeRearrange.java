package common.programs.arrays;

import java.util.ArrayList;

public class PositiveNegativeRearrange {

    public static void positiveNegativeRearrange(int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        int count = 0;
        int l = 0;
        int r = 0;

        while(count < arr.length){
            if(l==list1.size()){
                arr[count] = list2.get(r);
                r++;
                count++;
                continue;
            }
            if(r==list2.size()){
                arr[count] = list1.get(l);
                l++;
                count++;
                continue;
            }
            if(count%2==0){
                arr[count] = list1.get(l);
                l++;
                count++;
                continue;
            }
            else{
                arr[count] = list2.get(r);
                r++;
                count++;
            }
        }

        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
