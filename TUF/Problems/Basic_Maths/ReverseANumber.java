import java.util.Scanner;

public class ReverseANumber {

    public static int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n > 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(reverseNumber(number));
        scanner.close();
    }
}
