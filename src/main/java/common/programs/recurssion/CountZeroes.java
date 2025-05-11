package common.programs.recurssion;

public class CountZeroes {
    static int count = 0;
    static int n = 1020;
    public static void main(String[] args) {

        System.out.println( countZeroes(n,count));
    }

    public static int countZeroes(int n, int count){
        if(n == 0) {
            return count;
        }

        if(n%10==0){
            count += 1;
        }
        return countZeroes(n/10,count);
    }
}
