import java.util.Scanner;
public class EuclideanAlgorithm {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int gcd =calculateGCD(a,b);
        System.out.println(gcd);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else if(a==0){
            return b;
        }

        else {
            return calculateGCD(b, a % b);
        }
    }
}


