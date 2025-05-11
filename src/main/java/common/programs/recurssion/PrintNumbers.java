package common.programs.recurssion;
//Print the numbers from 1 to N and vice versa using recursion
public class PrintNumbers {
    public static void main(String[] args) {
        int num = 10;
        printInReverse(num);

    }
    //This will print from num to 1
    public static void printInReverse(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printInReverse(num-1);
    }
    //This will print from 1 to num
    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        printNumbers(num-1);
        System.out.println(num);
    }


}
