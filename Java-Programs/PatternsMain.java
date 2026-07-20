import java.util.Scanner;

class Patterns {
    int n;

    // Parameterized Constructor
    Patterns(int n) {
        this.n = n;
    }

    // Pattern 1
    void pattern1() {
        System.out.println("\nPattern 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    void pattern2() {
        System.out.println("\nPattern 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    void pattern3() {
        System.out.println("\nPattern 3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    void pattern4() {
        System.out.println("\nPattern 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class PatternsMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Create Object
        Patterns obj = new Patterns(n);

        obj.pattern1();
        obj.pattern2();
        obj.pattern3();
        obj.pattern4();

        sc.close();
    }
}