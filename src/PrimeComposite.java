import java.util.Scanner;
public class PrimeComposite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean result = isPrime(n, n/2);
        if (result) {
            System.out.println(" prime");
        } else {
            System.out.println("composite");
        }
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return true;
        }
        if (i == 1) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }

    }







