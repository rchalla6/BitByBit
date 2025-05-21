import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern17(n);
        scanner.close();
    }

    public static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < i)
                    ch += 1;
                else
                    ch -= 1;
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
