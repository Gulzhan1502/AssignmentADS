import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        double ave = calculateAverage(arr);

        System.out.println(ave);
    }
    public static double calculateAverage(int[] arr) {
        int sum = sum(arr, arr.length - 1);
        return (double) sum / arr.length;
    }
    private static int sum(int[] arr, int index) {
        if (index == 0) {
            return arr[index];
        } else {
            return arr[index] + sum(arr, index - 1);
        }
    }

}



