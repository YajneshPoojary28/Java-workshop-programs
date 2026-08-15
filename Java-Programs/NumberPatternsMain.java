import java.util.Scanner;

class NumberPatterns {
    int n;

    // Parameterized Constructor
    NumberPatterns(int n) {
        this.n = n;
    }

    // Pattern 1
    // 1
    // 1 2
    // 1 2 3
    void pattern1() {
        System.out.println("\nPattern 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    // 1
    // 2 2
    // 3 3 3
    void pattern2() {
        System.out.println("\nPattern 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    // 1
    // 2 3
    // 4 5 6
    void pattern3() {
        System.out.println("\nPattern 3");

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Pattern 4
    // 1
    // 1 2
    // 3 5 8
    void pattern4() {
        System.out.println("\nPattern 4");

        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

public class NumberPatternsMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        NumberPatterns obj = new NumberPatterns(n);

        obj.pattern1();
        obj.pattern2();
        obj.pattern3();
        obj.pattern4();

        sc.close();
    }
}