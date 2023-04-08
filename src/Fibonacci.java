import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = calculateFibonacci(n);
        System.out.println(result);
    }
    public static int calculateFibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return calculateFibonacci(n-1)+calculateFibonacci(n-2);
        }

    }

}

