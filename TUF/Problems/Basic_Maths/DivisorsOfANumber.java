import java.util.Arrays;
import java.util.Scanner;

public class DivisorsOfANumber {

    public static int[] divisors(int n) {
        int[] tempArray = new int[n];
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tempArray[count++] = i;
            }
        }
        tempArray[count++] = n;
        int[] arrayWithExactSize = Arrays.copyOf(tempArray, count);
        return arrayWithExactSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] ans = divisors(number);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        scanner.close();
    }
}
