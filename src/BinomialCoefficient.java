import java.util.Scanner;
public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int result =calculateBinomialCoefficient(n,k);
        System.out.println(result);
    }

    public static int calculateBinomialCoefficient(int n, int k){
        if (k == 0 || k == n) {
            return 1;
        }
        else if (n < 0 || k < 0 || k > n) {
            System.out.println("Invalid input");
            return ' ';

        }
        else{
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);

        }

    }
}
