package common.programs.recurssion;

public class PrintMultiplicationTable {

    public static void main(String[] args) {
        multiply(2,1);
    }

    public static void multiply(int num, int n){
        if(n > 10){
            return;
        }

        System.out.println(num * n);
        multiply(num,n+1);
    }
}
