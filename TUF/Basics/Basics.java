import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        String name = "Raja";
        String lastName = "Ch";
        System.out.println(name.charAt(2));
        System.out.println(name.substring(1));
        System.out.println(name.substring(0, 2));
        System.out.println(name + lastName);
        System.out.println(name.equals(lastName));

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();

        int x = 10;
        double y = x;
        System.out.println(y);

        double a = 10.7;
        int b = (int) a;
        System.out.println(b);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr.length);

        int[][] arr1 = { { 6, 4 }, { 3, 2, 0 } };
        int[] zeroIndex = arr1[0];
        System.out.println(zeroIndex[1]);
        System.out.println(arr1[0][1]);
    }
}
