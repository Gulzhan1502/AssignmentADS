import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = calculateFactorial(n);
        System.out.println(result);
}

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * calculateFactorial(n-1);
        }
    }
}
