import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern22(n);
        scanner.close();
    }

    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(n - Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j)) + " ");
            }
            System.out.println("");
        }
    }
}
