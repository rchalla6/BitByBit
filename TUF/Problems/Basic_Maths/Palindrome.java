import java.util.Scanner;

public class Palindrome {

    public static int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n > 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int n) {
        int reverseNumber = reverseNumber(n);
        return reverseNumber == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
        scanner.close();
    }
}
