import java.util.Scanner;

public class CountDigitsOfANumber {

    public static int countDigit(int n) {
        if (n == 0)
            return 1;
        int countDigit = 0;
        while (n > 0) {
            n /= 10;
            countDigit++;
        }
        return countDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countDigit(number));
        scanner.close();
    }
}
