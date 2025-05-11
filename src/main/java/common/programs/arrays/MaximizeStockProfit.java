package common.programs.arrays;
/*
Given an array prices[] of length N,representing the prices of the stocks on different days,
the task is to find the maximum profit possible by buying and selling the stocks on different days
when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

Note: Stock must be bought before being sold.
 */
public class MaximizeStockProfit {

    public static void maximizeProfit(int[] arr){
        int difference = -1;
        int buy = Integer.MIN_VALUE;
        int sell = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length-1; i++){

            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    continue;
                }
                if(arr[j] - arr[i] > difference){
                    difference = arr[j] - arr[i];
                    buy = i;
                    sell = j;
                }
            }
        }
        if(difference == -1){
            System.out.println("No profit");
        }
        else{
            System.out.println("Buy: "+buy +" Sell: "+sell);
        }

    }
}
