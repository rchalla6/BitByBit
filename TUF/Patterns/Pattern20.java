import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern20(n);
        scanner.close();
    }

    public static void pattern20(int n) {
        printUpperHalf(n);
        printLowerHalf(n);
    }

    private static void printUpperHalf(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void printLowerHalf(int n) {
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
