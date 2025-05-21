import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern15(n);
        scanner.close();
    }

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
