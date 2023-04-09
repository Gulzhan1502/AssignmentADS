import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (isDigit(s)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }

    }
    public static boolean isDigit(String s){
        if (s.length() == 0) {
            return true;
        } else {
            char firstChar = s.charAt(0);
            if (!Character.isDigit(firstChar)) {
                return false;
            } else {
                return isDigit(s.substring(1));
            }
        }
    }



}

