import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        permute(s.toCharArray(), 0);
    }


    private static void permute(char[] chars, int index) {
        if (index==chars.length-1) {
            System.out.println(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                permute(chars, index + 1);
                swap(chars, index, i);
            }
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }



}
