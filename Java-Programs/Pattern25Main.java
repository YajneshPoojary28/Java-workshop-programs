import java.util.Scanner;

class Pattern25 {
    int n;

    // Parameterized Constructor
    Pattern25(int n) {
        this.n = n;
    }

    // Pattern 1
    // 1
    // -4 9
    // -16 25 -36
    void pattern1() {
        System.out.println("\nPattern 1");

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                int square = num * num;

                if (num % 2 == 0)
                    System.out.print(-square + "\t");
                else
                    System.out.print(square + "\t");

                num++;
            }
            System.out.println();
        }
    }

    // Pattern 2
    // 1
    // 1 2
    // 6 24 120
    void pattern2() {
        System.out.println("\nPattern 2");

        int fact = 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                fact *= num;
                System.out.print(fact + "\t");
                num++;
            }
            System.out.println();
        }
    }

    // Pattern 3
    // Right Aligned Triangle
    void pattern3() {
        System.out.println("\nPattern 3");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Pattern 4
    // Right Aligned Pyramid
    void pattern4() {
        System.out.println("\nPattern 4");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++)
                System.out.print("  ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}

public class Pattern25Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Pattern25 obj = new Pattern25(n);

        obj.pattern1();
        obj.pattern2();
        obj.pattern3();
        obj.pattern4();

        sc.close();
    }
}