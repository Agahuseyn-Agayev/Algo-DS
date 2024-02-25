package alqoritms;

public class Factorial {
    public static int factorialWithRecursion(int n){
        if(n<=1){
            return 1;
        }else {
            return n*factorialWithRecursion(n-1);
        }
    }

    public static void factorial(int element) {
        int factorial = 1;
        if (element < factorial) {
            throw new IllegalArgumentException("Invalid data");
        }
        for (int i = 1; i <= element; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
