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

        // Given an age, print "adult" if age >=18, or print "Teen"

        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }

        /*
         * Given the marks of a student, tell us the grade he is getting
         * following the below rules
         * - Grade A (>=90)
         * - Grade B (>=70 and <90)
         * - Grade C (>=50 and <70)
         * - Grade D (>=35 and <50)
         * - Fail (<35)
         */
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        // Given the day number print which day it is of the week,
        // assume week starts from Monday and ends on Sunday

        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
        case 1:
            System.out.println("Mon");
            break;
        case 2:
            System.out.println("Tue");
            break;
        case 3:
            System.out.println("Wed");
            break;
        case 4:
            System.out.println("Thu");
            break;
        case 5:
            System.out.println("Fri");
            break;
        case 6:
            System.out.println("Sat");
            break;
        case 7:
            System.out.println("Sun");
            break;
        default:
            System.out.println("Invalid day number");
        }

        scanner.close();
    }
}
