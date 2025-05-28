import java.util.Scanner;

public class ReturnLargestDigit {

    public static int countOddDigit(int n) {
        int largestDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 10 > largestDigit) {
                largestDigit = lastDigit;
            }
            n /= 10;
        }
        return largestDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countOddDigit(number));
        scanner.close();
    }
}
