import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreiben Sie ein Palindrome:");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " ist ein Palindrom.");
        } else {
            System.out.println(input + " ist kein Palindrom.");
        }
    }

    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
