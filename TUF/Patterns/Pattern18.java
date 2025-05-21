import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern18(n);
        scanner.close();
    }

    public static void pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char) ('A' + n - j));
            }
            System.out.println();
        }
    }
}
