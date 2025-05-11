package runtimeException;

public class ArithmeticExceptions {
    public static void main(String[] args) {
        exceptionHandling();
    }

    public static int invalidDivision(int n) {
            return n/0;
    }

    public static void exceptionHandling() {
        try {
            int a = 10/0;
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
