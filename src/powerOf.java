import java.util.Scanner;

public class powerOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int result = calculatePower(a, n);
        System.out.println(result);
    }
    public static int calculatePower(int a, int n) {
        if (n==0){
            return 1;
        }

        else{
            return a * calculatePower(a, n-1);
        }
    }
}
