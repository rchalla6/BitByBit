import java.util.Scanner;

public class CountOddDigitsOfANumber {

    public static int countOddDigit(int n) {
        if (n == 0)
            return 0;
        int countOddDigit = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                countOddDigit++;
            }
            n /= 10;
        }
        return countOddDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countOddDigit(number));
        scanner.close();
    }
}
